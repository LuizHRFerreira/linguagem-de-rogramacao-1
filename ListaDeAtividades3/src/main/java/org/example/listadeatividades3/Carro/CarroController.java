package org.example.listadeatividades3.Carro;

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

public class CarroController {

    @FXML
    private Label Titulo;

    @FXML
    private Button cadastrar_carro;

    @FXML
    private TextField cor_carro;

    @FXML
    private TextField fabricante_carro;

    @FXML
    private TextField modelo_carro;

    @FXML
    void cadastrarCarro(ActionEvent event) throws IOException {
        // Cria um novo objeto Album com os dados do formulário
        Carro carro = new Carro(modelo_carro.getText(), fabricante_carro.getText(), cor_carro.getText());

        // Carrega o FXML da tela OuvirAlbum
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades3/dirigir-carro-view.fxml"));
        Parent root = fxmlLoader.load();

        // Obtém o controller do FXML
        DirigirCarroController DirigirCarroController = fxmlLoader.getController();
        DirigirCarroController.setCarro(carro); // Passa o objeto Carro para o controller

        // Cria nova Stage
        Stage stage = new Stage();
        stage.setTitle("Dirigir Carro");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(root, 394, 284)); // Definindo largura e altura
        stage.show();
    }

}
