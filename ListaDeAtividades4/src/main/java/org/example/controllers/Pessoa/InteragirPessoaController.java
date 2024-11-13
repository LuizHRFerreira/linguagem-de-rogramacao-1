package org.example.listadeatividades4.Pessoa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class InteragirPessoaController {

        @FXML
        private Label Titulo;

        @FXML
        private Button andar_pessoa;

        @FXML
        private Label data_nascimento;

        @FXML
        private Button dormir_pessoa;

        @FXML
        private Button falar_pessoa;

        @FXML
        private Label genero_pessoa;

        @FXML
        private Label nome_pessoa;

        @FXML
        private Label resul;

        @FXML
        void andarPessoa(ActionEvent event) {
            resul.setText(Pessoa.andar());
        }

        @FXML
        void dormirPessoa(ActionEvent event) {
            resul.setText(Pessoa.dormir());
        }

        @FXML
        void falarPessoa(ActionEvent event) {
            resul.setText(Pessoa.falar());
        }
    // Método para receber o objeto Album
    public void setPessoa(Pessoa pessoa) {
        nome_pessoa.setText(Pessoa.getNome());
        genero_pessoa.setText(Pessoa.getGenero());
        data_nascimento.setText(Pessoa.getDataDeNascimento());
    }
    }
