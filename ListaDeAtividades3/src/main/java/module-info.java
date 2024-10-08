module org.example.listadeatividades {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.listadeatividades3 to javafx.fxml;
    exports org.example.listadeatividades3;

    opens org.example.listadeatividades3.animal to javafx.fxml;
    exports org.example.listadeatividades3.animal;

    opens org.example.listadeatividades3.Bola to javafx.fxml;
    exports org.example.listadeatividades3.Bola;

    opens org.example.listadeatividades3.Carro to javafx.fxml;
    exports org.example.listadeatividades3.Carro;

    opens org.example.listadeatividades3.Casa to javafx.fxml;
    exports org.example.listadeatividades3.Casa;

    opens org.example.listadeatividades3.Felino to javafx.fxml;
    exports org.example.listadeatividades3.Felino;
}
