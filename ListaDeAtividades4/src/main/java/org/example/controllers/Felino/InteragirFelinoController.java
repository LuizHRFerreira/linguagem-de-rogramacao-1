package org.example.listadeatividades4.Felino;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class InteragirFelinoController {

    @FXML
    private Label Titulo;

    @FXML
    private Button alongar_felino;

    @FXML
    private Button comer_felino;

    @FXML
    private Label cor_felino;

    @FXML
    private Button dormir_felino;

    @FXML
    private Label especie_felino;

    @FXML
    private Label resul;

    @FXML
    private Label tamanho_felino;

    @FXML
    void alongarFelino(ActionEvent event) {
        resul.setText(Felino.alongar());
    }

    @FXML
    void comerFelino(ActionEvent event) {
        resul.setText(Felino.comer());
    }

    @FXML
    void dormirFelino(ActionEvent event) {
        resul.setText(Felino.dormir());
    }

    // Método para receber o objeto Animal
    public void setFelino(Felino felino) {
        especie_felino.setText(Felino.getEspecie());
        tamanho_felino.setText(Felino.getTamanho());
        cor_felino.setText(Felino.getCor());
    }
}