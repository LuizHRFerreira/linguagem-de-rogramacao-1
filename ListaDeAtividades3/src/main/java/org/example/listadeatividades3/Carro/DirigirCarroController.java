package org.example.listadeatividades3.Carro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DirigirCarroController {

        @FXML
        private Label Titulo;

        @FXML
        private Button acelerar_carro;

        @FXML
        private Label cor_carro;

        @FXML
        private Button desligar_carro;

        @FXML
        private Label fabricante_carro;

        @FXML
        private Button ligar_carro;

        @FXML
        private Label modelo_carro;

        @FXML
        private Label resul;

        @FXML
        void acelerar(ActionEvent event) {
                resul.setText(Carro.acelerar());
        }

        @FXML
        void desligar(ActionEvent event) {
                resul.setText(Carro.desligar());
        }

        @FXML
        void ligar(ActionEvent event) {
                resul.setText(Carro.ligar());
        }
        // Método para receber o objeto Album
        public void setCarro(Carro carro) {
                modelo_carro.setText(Carro.getModelo());
                fabricante_carro.setText(Carro.getfabricante());
                cor_carro.setText(Carro.getCor());
        }
    }


