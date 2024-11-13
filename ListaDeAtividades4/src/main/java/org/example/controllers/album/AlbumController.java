package org.example.controllers.album;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import org.example.dao.AlbumDAO;
import org.example.models.Album;

import java.io.IOException;


public class AlbumController {

    @FXML
    private Label Titulo;

    @FXML
    private Button cadastrar_album;

    @FXML
    private Button cancelar_album;

    @FXML
    private DatePicker data_album;

    @FXML
    private TextField interprete_album;

    @FXML
    private TextField nome_album;

    @FXML
    void cadastrarAlbum(ActionEvent event) throws IOException {
        // Cria um novo objeto Album com os dados do formulário
       Album album = new Album(nome_album.getText(), data_album.getValue(), interprete_album.getText());

        AlbumDAO dao = new AlbumDAO();

        // Carrega o FXML da tela OuvirAlbum
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades4/album/ouvir_album_view.fxml"));
        Parent root = fxmlLoader.load();

        // Obtém o controller do FXML
        OuvirAlbumController ouvirAlbumController = fxmlLoader.getController();
        ouvirAlbumController.setAlbum(album); // Passa o objeto Album para o controller

        // Cria nova Stage
        Stage stage = new Stage();
        stage.setTitle("Ouvir Album");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(root, 573, 326)); // Definindo largura e altura
        stage.show();
    }

}
