module org.example.listadeatividades3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.listadeatividades3 to javafx.fxml;
    exports org.example.listadeatividades3;

    opens org.example.listadeatividades3.animal to javafx.fxml;
    exports org.example.listadeatividades3.animal;

    opens org.example.listadeatividades3.Bola to javafx.fxml;
    exports org.example.listadeatividades3.Bola;
}
