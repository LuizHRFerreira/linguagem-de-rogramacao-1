package org.example.listadeatividades4.Bola;

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


public class BolaController {

        @FXML
        private Label Titulo;

        @FXML
        private Button cadastrar_bola;

        @FXML
        private TextField cor_bola;

        @FXML
        private TextField esporte_bola;

        @FXML
        private TextField formato_bola;

        @FXML
        void cadastrarBola(ActionEvent event) throws IOException {
// Cria um novo objeto Animal com os dados do formulário
                Bola bola = new Bola(formato_bola.getText(), esporte_bola.getText(), cor_bola.getText());

                // Carrega o FXML da tela InteragirAnimal
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades3/interagir-bola-view.fxml"));
                Parent root = fxmlLoader.load();

                // Obtém o controller do FXML
                IntegrateBolaController InteragirBolaController = fxmlLoader.getController();
                InteragirBolaController.setBola(bola); // Passa o objeto Animal para o controller

                // Cria nova Stage
                Stage stage = new Stage();
                stage.setTitle("Interagir Bola");
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(new Scene(root, 394, 284)); // Definindo largura e altura
                stage.show();
        }

    }
