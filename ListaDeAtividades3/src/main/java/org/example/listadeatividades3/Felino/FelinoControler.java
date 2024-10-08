package org.example.listadeatividades3.Felino;

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
import org.example.listadeatividades3.animal.Animal;
import org.example.listadeatividades3.animal.InteragirAnimalController;

import java.io.IOException;

public class FelinoControler {

        @FXML
        private Label Titulo;

        @FXML
        private Button cadastrar_felino;

        @FXML
        private TextField cor_felino;

        @FXML
        private TextField especie_felino;

        @FXML
        private TextField tamanho_felino;

        @FXML
        void cadastrarFelino(ActionEvent event) throws IOException {
            // Cria um novo objeto Animal com os dados do formulário
            Felino felino = new Felino(especie_felino.getText(), tamanho_felino.getText(), cor_felino.getText());

            // Carrega o FXML da tela InteragirAnimal
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades3/interagir-felino-view.fxml"));
            Parent root = fxmlLoader.load();

            // Obtém o controller do FXML
            InteragirFelinoController InteragirFelinoController = fxmlLoader.getController();
            InteragirFelinoController.setFelino(felino); // Passa o objeto Animal para o controller

            // Cria nova Stage
            Stage stage = new Stage();
            stage.setTitle("Interagir Felino");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root, 394, 284)); // Definindo largura e altura
            stage.show();
        }

    }

