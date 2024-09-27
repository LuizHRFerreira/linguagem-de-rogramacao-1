package org.example.listadeatividades3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AlbumController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onAlbumButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}