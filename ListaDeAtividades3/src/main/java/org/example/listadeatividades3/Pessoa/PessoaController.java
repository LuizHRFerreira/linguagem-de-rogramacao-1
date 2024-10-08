package org.example.listadeatividades3.Pessoa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.listadeatividades3.Album;
import org.example.listadeatividades3.OuvirAlbumController;

import java.io.IOException;

public class PessoaController {

        @FXML
        private Label Titulo;

        @FXML
        private Button cadastrar_pessoa;

        @FXML
        private DatePicker data_nascimento;

        @FXML
        private TextField genero_pessoa;

        @FXML
        private TextField nome_pessoa;

        @FXML
        void cadastrarPessoa(ActionEvent event) throws IOException {
            Pessoa pessoa = new Pessoa(nome_pessoa.getText(), genero_pessoa.getText(), data_nascimento.getValue().toString());

            // Carrega o FXML da tela OuvirAlbum
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades3/interagir-pessoa.fxml"));
            Parent root = fxmlLoader.load();

            // Obtém o controller do FXML
            InteragirPessoaController onteragirPessoaController = fxmlLoader.getController();
            onteragirPessoaController.setPessoa(pessoa); // Passa o objeto Album para o controller

            // Cria nova Stage
            Stage stage = new Stage();
            stage.setTitle("Interagir Pessoa");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root, 394, 284)); // Definindo largura e altura
            stage.show();
        }

    }

