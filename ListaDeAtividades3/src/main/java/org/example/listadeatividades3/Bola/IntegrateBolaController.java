package org.example.listadeatividades3.Bola;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class IntegrateBolaController {

        @FXML
        private Button Arremessar_Bola;

        @FXML
        private Button Chutar_Bola;

        @FXML
        private Button Pegar_Bola;

        @FXML
        private Label Cor_bola;

        @FXML
        private Label Esporte_bola;

        @FXML
        private Label Formato_bola;

        @FXML
        private Label resul;

        @FXML
        void arremessar(ActionEvent event) {
        resul.setText(Bola.arremessar());
        }

        @FXML
        void chutar(ActionEvent event) {
                resul.setText(Bola.chutar());
        }

        @FXML
        void pegar(ActionEvent event) {
                resul.setText(Bola.pegar());
        }

        // Método para receber o objeto Animal
        public void setBola(Bola bola) {
                Formato_bola.setText(Bola.getFormato());
                Esporte_bola.setText(Bola.getEsporte());
                Cor_bola.setText(Bola.getCor());
                }

    }

