package org.example.listadeatividades4.Flor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class InteragirFlorController {

    @FXML
    private Label Titulo;

    @FXML
    private Button cheirar_flor;

    @FXML
    private Label cor_flor;

    @FXML
    private Button crescer_flor;

    @FXML
    private Label especie_flor;

    @FXML
    private Button nascer_flor;

    @FXML
    private Label preco_flor;

    @FXML
    private Label resul;

    @FXML
    void NascerFlor(ActionEvent event) {
        resul.setText(Flor.nascer());
    }

    @FXML
    void cheirarFlor(ActionEvent event) {
        resul.setText(Flor.cheirar());
    }

    @FXML
    void crescerFlor(ActionEvent event) {
        resul.setText(Flor.crescer());
    }
    // Método para receber o objeto Animal
    public void setFlor(Flor flor) {
        especie_flor.setText(Flor.getEspecie());
        preco_flor.setText(Flor.getPreco());
        cor_flor.setText(Flor.getCor());
    }
}

