package org.example.listadeatividades4.InstrumentoMusical;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class InstrumentoMusicalController {

        @FXML
        private Label Titulo;

        @FXML
        private TextField afinalcao_instrumento;

        @FXML
        private Button cadastrar_instrumento;

        @FXML
        private TextField formato_instrumento;

        @FXML
        private TextField modelo_instrumento;

        @FXML
        void CadastrarInstrumento(ActionEvent event) throws IOException {
            // Cria um novo objeto Instrumento com os dados do formulário
            InstrumentoMusical instrumentomusical = new InstrumentoMusical(modelo_instrumento.getText(), formato_instrumento.getText(), afinalcao_instrumento.getText());

            // Carrega o FXML da tela InteragirAnimal
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades3/tocar-instrumento-view.fxml"));
            Parent root = fxmlLoader.load();

            // Obtém o controller do FXML
            TocarInstrumentoController TocarInstrumentoController = fxmlLoader.getController();
            TocarInstrumentoController.setInstrumento(instrumentomusical); // Passa o objeto Animal para o controller

            // Cria nova Stage
            Stage stage = new Stage();
            stage.setTitle("Tocar Instrumento");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root, 394, 284)); // Definindo largura e altura
            stage.show();
        }

}
