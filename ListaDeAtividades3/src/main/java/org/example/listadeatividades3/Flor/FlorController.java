package org.example.listadeatividades3.Flor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class FlorController {

        @FXML
        private Label Titulo;

        @FXML
        private Button cadastrar_flor;

        @FXML
        private TextField cor_flor;

        @FXML
        private TextField especie_flor;

        @FXML
        private TextField preco_flor;

        @FXML
        void cadastrarFlor(ActionEvent event)  throws IOException {
                // Cria um novo objeto Animal com os dados do formulário
                Flor flor = new Flor(especie_flor.getText(), cor_flor.getText(), preco_flor.getText());

                // Carrega o FXML da tela InteragirAnimal
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades3/interagir-flor-view.fxml"));
                Parent root = fxmlLoader.load();

                // Obtém o controller do FXML
                InteragirFlorController InteragirFlorController = fxmlLoader.getController();
                InteragirFlorController.setFlor(flor); // Passa o objeto Animal para o controller

                // Cria nova Stage
                Stage stage = new Stage();
                stage.setTitle("Interagir Flor");
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(new Scene(root, 394, 284)); // Definindo largura e altura
                stage.show();
        }

    }

