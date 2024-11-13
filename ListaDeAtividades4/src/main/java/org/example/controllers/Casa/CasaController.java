package org.example.listadeatividades4.Casa;

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

public class CasaController {

    @FXML
    private Label Titulo;

    @FXML
    private Button cadastrar_casa;

    @FXML
    private TextField cor_casa;

    @FXML
    private TextField funcionalidade_casa;

    @FXML
    private TextField tamanho_casa;

    @FXML
    void cadastrarCasa(ActionEvent event) throws IOException {
        // Cria um novo objeto Album com os dados do formulário
        Casa casa = new Casa(tamanho_casa.getText(), cor_casa.getText(), funcionalidade_casa.getText());

        // Carrega o FXML da tela OuvirAlbum
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades3/interagir-casa-view.fxml"));
        Parent root = fxmlLoader.load();

        // Obtém o controller do FXML
        InteragirCasa InteragirCasa = fxmlLoader.getController();
        InteragirCasa.setCasa(casa);

        // Cria nova Stage
        Stage stage = new Stage();
        stage.setTitle("Interagir Casa");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(root, 394, 284)); // Definindo largura e altura
        stage.show();
    }

}
