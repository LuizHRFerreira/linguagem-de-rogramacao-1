package org.example.listadeatividades3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AlbumApplication extends Application {

    static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(AlbumApplication.class.getResource("Album-view.fxml"));
        scene = new Scene(loadFXML("Album-view"), 573, 482);
        stage.setTitle("Album");
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException{
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AlbumApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
