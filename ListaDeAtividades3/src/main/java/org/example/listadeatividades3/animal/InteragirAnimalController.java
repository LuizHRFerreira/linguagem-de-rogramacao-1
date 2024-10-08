package org.example.listadeatividades3.animal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class InteragirAnimalController {

    @FXML
    private Label Especie_animal;

    @FXML
    private Label Titulo;

    @FXML
    private Button animal_acordar;

    @FXML
    private Button animal_comer;

    @FXML
    private Button animal_correr;

    @FXML
    private Label cor_animal;

    @FXML
    private Label resul;

    @FXML
    private Label sexo_animal;

    @FXML
    void acordar(ActionEvent event) {
        resul.setText(Animal.acordar());
    }

    @FXML
    void comer(ActionEvent event) {
        resul.setText(Animal.comer());
    }

    @FXML
    void correr(ActionEvent event) {
        resul.setText(Animal.correr());
    }

    // Método para receber o objeto Animal
    public void setAnimal(Animal animal) {
        Especie_animal.setText(animal.getEspecie());
        sexo_animal.setText(animal.getSexo());
        cor_animal.setText(animal.getCor());
    }
}
