package org.example.listadeatividades3.TimeFutebol;

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

public class TimeFutebolController {

        @FXML
        private Label Titulo;

        @FXML
        private Button cadastrar_time;

        @FXML
        private TextField cores_time;

        @FXML
        private TextField nome_time;

        @FXML
        private TextField pais_time;

        @FXML
        void cadastrarTime(ActionEvent event) throws IOException {
            TimeFutebol time = new TimeFutebol(nome_time.getText(), pais_time.getText(), cores_time.getText());

            // Carrega o FXML da tela OuvirAlbum
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades3/gerenciar-time-view.fxml"));
            Parent root = fxmlLoader.load();

            // Obtém o controller do FXML
            GerenciarTimeController gerenciarTimeController = fxmlLoader.getController();
            gerenciarTimeController.setTime(time); // Passa o objeto Album para o controller

            // Cria nova Stage
            Stage stage = new Stage();
            stage.setTitle("Gerenciar Time");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root, 394, 284)); // Definindo largura e altura
            stage.show();
        }

    }

