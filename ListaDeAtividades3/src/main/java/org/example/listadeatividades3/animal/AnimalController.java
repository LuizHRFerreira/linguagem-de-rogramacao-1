package org.example.listadeatividades3.animal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AnimalController {

    @FXML
    private Button cadastrar_animal;

    @FXML
    private TextField cor_animal;

    @FXML
    private TextField especie_animal;

    @FXML
    private TextField sexo_animal;

    @FXML
    private void cadastrarAnimal(ActionEvent event) throws IOException {
        // Cria um novo objeto Animal com os dados do formulário
        Animal animal = new Animal(especie_animal.getText(), sexo_animal.getText(), cor_animal.getText());

        // Carrega o FXML da tela InteragirAnimal
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades3/interagir-animal-view.fxml"));
        Parent root = fxmlLoader.load();

        // Obtém o controller do FXML
        InteragirAnimalController interagirAnimalController = fxmlLoader.getController();
        interagirAnimalController.setAnimal(animal); // Passa o objeto Animal para o controller

        // Cria nova Stage
        Stage stage = new Stage();
        stage.setTitle("Interagir Animal");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(root, 394, 284)); // Definindo largura e altura
        stage.show();
    }
}
