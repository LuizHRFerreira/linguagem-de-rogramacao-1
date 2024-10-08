package org.example.listadeatividades3.Casa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.example.listadeatividades3.Carro.Carro;

public class InteragirCasa {

    @FXML
    private Label Titulo;

    @FXML
    private Button campainha_casa;

    @FXML
    private Label cor_casa;

    @FXML
    private Button entrar_casa;

    @FXML
    private Label funcionalidade_casa;

    @FXML
    private Label resul;

    @FXML
    private Button sair_casa;

    @FXML
    private Label tamanho_casa;

    @FXML
    void campainha(ActionEvent event) {
        resul.setText(Casa.tocarCampainha());
    }

    @FXML
    void entrar(ActionEvent event) {
        resul.setText(Casa.entrar());
    }

    @FXML
    void sair(ActionEvent event) {
        resul.setText(Casa.sair());
    }

    // Método para receber o objeto Album
    public void setCasa(Casa casa) {
        tamanho_casa.setText(Casa.getTamanho());
        cor_casa.setText(Casa.getCor());
        funcionalidade_casa.setText(Casa.getfuncionalidade());
    }
}

