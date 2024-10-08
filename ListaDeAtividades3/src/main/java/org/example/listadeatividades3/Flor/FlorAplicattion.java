package org.example.listadeatividades3.Flor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FlorAplicattion extends Application {

        static Scene scene;

        @Override
        public void start(Stage stage) throws IOException {
            scene = new Scene(loadFXML("Flor-view"), 573, 482);
            stage.setTitle("Flor");
            stage.setScene(scene);
            stage.show();
        }

        static void setRoot(String fxml) throws IOException{
            scene.setRoot(loadFXML(fxml));
        }

        private static Parent loadFXML(String fxml) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(org.example.listadeatividades3.Felino.FelinoApplication.class.getResource("/org/example/listadeatividades3/" + fxml + ".fxml"));
            return fxmlLoader.load();
        }

        public static void main(String[] args) {
            launch();
        }

    }