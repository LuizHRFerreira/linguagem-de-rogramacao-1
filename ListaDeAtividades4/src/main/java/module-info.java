module org.example.listadeatividades {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.controllers.album to javafx.fxml;
    exports org.example;

    opens org.example.listadeatividades4.animal to javafx.fxml;
    exports org.example.listadeatividades4.animal;

    opens org.example.listadeatividades4.Bola to javafx.fxml;
    exports org.example.listadeatividades4.Bola;

    opens org.example.listadeatividades4.Carro to javafx.fxml;
    exports org.example.listadeatividades4.Carro;

    opens org.example.listadeatividades4.Casa to javafx.fxml;
    exports org.example.listadeatividades4.Casa;

    opens org.example.listadeatividades4.Felino to javafx.fxml;
    exports org.example.listadeatividades4.Felino;

    opens org.example.listadeatividades4.Flor to javafx.fxml;
    exports org.example.listadeatividades4.Flor;

    opens org.example.listadeatividades4.InstrumentoMusical to javafx.fxml;
    exports org.example.listadeatividades4.InstrumentoMusical;

    opens org.example.listadeatividades4.Pessoa to javafx.fxml;
    exports org.example.listadeatividades4.Pessoa;

    opens org.example.listadeatividades4.TimeFutebol to javafx.fxml;
    exports org.example.listadeatividades4.TimeFutebol;
}
