package org.example.listadeatividades3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class OuvirAlbumController {

    @FXML
    private Label Titulo;

    @FXML
    private Label Titulo_album;

    @FXML
    private Label Titulo_album1;

    @FXML
    private Label Titulo_album11;

    @FXML
    private Label Titulo_album111;

    @FXML
    private Button baixar_album;

    @FXML
    private Label data_album;

    @FXML
    private Label interprete_album;

    @FXML
    private Button ouvir_album;

    @FXML
    private Button pausar_album;


    @FXML
    private Label resul;

    @FXML
    void ouvir(ActionEvent event) {
        // Implementar lógica de ouvir
        resul.setText(Album.ouvir());
    }

    @FXML
    void Pausar (ActionEvent event) {
        // Implementar lógica de pausar
        resul.setText(Album.pausar());
    }

    @FXML
    void baixar(ActionEvent event) {
        resul.setText(Album.baixar());
    }

    // Método para receber o objeto Album
    public void setAlbum(Album album) {
        Titulo_album.setText(album.getTitulo());
        interprete_album.setText(album.getInterprete());
        data_album.setText(album.getDataLancamento());
    }
}