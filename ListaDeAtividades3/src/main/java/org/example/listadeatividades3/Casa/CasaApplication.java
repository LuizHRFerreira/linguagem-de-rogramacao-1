package org.example.listadeatividades3.Casa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.listadeatividades3.Casa.Casa;

import java.io.IOException;

public class CasaApplication extends Application {

    static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("casa-view"), 573, 482);
        stage.setTitle("Casa");
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException{
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(org.example.listadeatividades3.Casa.CasaApplication.class.getResource("/org/example/listadeatividades3/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
