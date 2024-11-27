package org.example.controllers.album;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.example.dao.AlbumDAO;
import org.example.models.Album;

import java.io.File;
import java.io.IOException;

public class OuvirAlbumController {

    @FXML
    private Label Titulo;

    @FXML
    private Label Titulo_album;

    @FXML
    private Button baixar_album;

    @FXML
    private ImageView capa;

    @FXML
    private Label data_album;

    @FXML
    private Label interprete_album;

    @FXML
    private Button ouvir_album;

    @FXML
    private Button pausar_album;

    @FXML
    private Slider barraProgresso; // Barra de progresso

    private MediaPlayer mediaPlayer;

    private DoubleProperty durationProperty = new SimpleDoubleProperty(0);

    @FXML
    void ouvir(ActionEvent event) {
        try {
            if (mediaPlayer == null) {
                // Obtem o nome do álbum exibido
                String albumName = Titulo_album.getText();

                // Caminho do arquivo MP3
                String filePath = "C:/Users/Luiz/Music/" + albumName + ".mp3";
                File file = new File(filePath);

                if (file.exists()) {
                    // Cria o Media e o MediaPlayer
                    Media media = new Media(file.toURI().toString());
                    mediaPlayer = new MediaPlayer(media);

                    // Conecta o mediaPlayer ao slider
                    configureProgressBar();

                    // Inicia a reprodução
                    mediaPlayer.play();
                } else {
                    System.out.println("Arquivo MP3 não encontrado: " + filePath);
                }
            } else {
                // Continua a reprodução caso esteja pausado
                mediaPlayer.play();
            }
        } catch (Exception e) {
            System.err.println("Erro ao reproduzir o áudio: " + e.getMessage());
        }
    }

    @FXML
    void Pausar(ActionEvent event) {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @FXML
    void baixar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades4/album/album-view.fxml"));
        Parent root = fxmlLoader.load();

        // Cria nova Stage
        Stage stageCadastro = new Stage();
        stageCadastro.setTitle("Album");
        stageCadastro.initModality(Modality.APPLICATION_MODAL);
        stageCadastro.setScene(new Scene(root, 573, 248)); // Definindo largura e altura
        stageCadastro.show();


        // Obtém a Stage atual e a fecha
        Stage stage = (Stage) baixar_album.getScene().getWindow();
        stage.close();
    }

    private void configureProgressBar() {
        if (barraProgresso == null) {
            System.err.println("Erro: barraProgresso não foi inicializado. Verifique o arquivo FXML e os IDs.");
            return;
        }

        // Habilita a barra de progresso
        barraProgresso.setDisable(false);

        // Atualiza o valor máximo do slider quando o arquivo é carregado
        mediaPlayer.setOnReady(() -> {
            Duration totalDuration = mediaPlayer.getTotalDuration();
            durationProperty.set(totalDuration.toSeconds());
            barraProgresso.setMax(durationProperty.get());
        });

        // Atualiza o slider enquanto a música toca
        mediaPlayer.currentTimeProperty().addListener((observable, oldValue, newValue) -> {
            barraProgresso.setValue(newValue.toSeconds());
        });

        // Permite que o usuário controle o progresso
        barraProgresso.setOnMouseReleased(event -> {
            if (mediaPlayer != null) {
                mediaPlayer.seek(Duration.seconds(barraProgresso.getValue()));
            }
        });
    }

    // Método para buscar as informações do álbum e atualizá-las na interface
    public void setAlbum(String album) {
        // Usando o AlbumDAO para buscar o álbum no banco de dados
        AlbumDAO albumDAO = new AlbumDAO();
        Album albumInfo = albumDAO.buscarAlbumPorNome(album);

        if (albumInfo != null) {
            // Atualiza os campos com as informações do álbum
            Titulo_album.setText(albumInfo.getTitulo());
            data_album.setText(albumInfo.getDataLancamento().toString());
            interprete_album.setText(albumInfo.getInterprete());

            // Carrega a imagem da capa
            Image capaImage = new Image("file:" + albumInfo.getCapa()); // Caminho da capa
            capa.setImage(capaImage);
        }
    }
}