module org.example.listadeatividades {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.media;


    opens org.example.controllers.album to javafx.fxml;
    exports org.example;

}
