package org.example.listadeatividades4.InstrumentoMusical;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TocarInstrumentoController {

        @FXML
        private Label Afinação_intrumento;

        @FXML
        private Label Modelo_instrumento;

        @FXML
        private Label Titulo;

        @FXML
        private Button afinar_instrumento;

        @FXML
        private Button compor_instrumento;

        @FXML
        private Label formato_instrumento;

        @FXML
        private Label resul;

        @FXML
        private Button tocar_instrumento;

        @FXML
        void afinarInstrumento(ActionEvent event) {
            resul.setText(InstrumentoMusical.afinar());
        }

        @FXML
        void comporInstrumento(ActionEvent event) {
            resul.setText(InstrumentoMusical.compor());
        }

        @FXML
        void tocarInstrumento(ActionEvent event) {
            resul.setText(InstrumentoMusical.tocar());
        }

    // Método para receber o objeto Animal
    public void setInstrumento(InstrumentoMusical instrumentoMusical) {
        Modelo_instrumento.setText(InstrumentoMusical.getModelo());
        formato_instrumento.setText(InstrumentoMusical.getFormato());
        Afinação_intrumento.setText(InstrumentoMusical.getAfinacao());
    }

    }

