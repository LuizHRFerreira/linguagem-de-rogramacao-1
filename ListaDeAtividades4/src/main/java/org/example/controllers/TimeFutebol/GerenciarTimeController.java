package org.example.listadeatividades4.TimeFutebol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GerenciarTimeController {

    @FXML
    private Label CorTime;

    @FXML
    private Label PaisTime;

    @FXML
    private Label Titulo;

    @FXML
    private Button contratar_time;

    @FXML
    private Button jogat_time;

    @FXML
    private Label nome_time;

    @FXML
    private Label resul;

    @FXML
    private Button treinar_time;

    @FXML
    void contratarTIme(ActionEvent event) {
        resul.setText(TimeFutebol.contratar());
    }

    @FXML
    void jogarTIme(ActionEvent event) {
        resul.setText(TimeFutebol.jogar());
    }

    @FXML
    void treinarTime(ActionEvent event) {
        resul.setText(TimeFutebol.treinar());
    }

    // Método para receber o objeto Album
    public void setTime(TimeFutebol timeFutebol) {
        nome_time.setText(TimeFutebol.getNome());
        PaisTime.setText(TimeFutebol.getPaisDeOrigem());
        CorTime.setText(TimeFutebol.getCores());
    }

}

