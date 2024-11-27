package org.example.controllers.album;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.dao.AlbumDAO;
import org.example.models.Album;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;


public class CadastrarAlbumController {

    private final AlbumDAO CadastroAlbum = new AlbumDAO();

    @FXML
    private Button voltar;

    @FXML
    private ImageView capa;

    @FXML
    private Label Titulo;

    @FXML
    private Button cadastrar_album;

    @FXML
    private Button cancelar_album;

    @FXML
    private DatePicker data_album;

    @FXML
    private TextField interprete_album;

    @FXML
    private TextField nome_album;

    @FXML
    private Button selecionarImagem;

    private File imagemSelecionada;

    @FXML
    private Label caminhoImagem; // Exibe o caminho da imagem selecionada

    @FXML
    void selecionarImagem(ActionEvent event) {
        // Criar o FileChooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Selecione uma imagem");

        // Filtros de extensão de arquivo
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Imagens", "*.png", "*.jpg", "*.jpeg"),
                new FileChooser.ExtensionFilter("Todos os arquivos", "*.*")
        );

        // Abrir a janela para selecionar o arquivo
        Stage stage = (Stage) selecionarImagem.getScene().getWindow();
        imagemSelecionada = fileChooser.showOpenDialog(stage);

        // Verificar se um arquivo foi selecionado
        if (imagemSelecionada != null) {
            caminhoImagem.setText(imagemSelecionada.getAbsolutePath()); // Exibe o caminho no Label
            System.out.println("Imagem selecionada: " + imagemSelecionada.getAbsolutePath());

            // Atualiza o ImageView com a imagem selecionada
            try {
                capa.setImage(new javafx.scene.image.Image(imagemSelecionada.toURI().toString()));
            } catch (Exception e) {
                System.err.println("Erro ao carregar a imagem: " + e.getMessage());
                caminhoImagem.setText("Erro ao carregar a imagem.");
            }
        } else {
            caminhoImagem.setText("Nenhuma imagem selecionada");
            System.out.println("Nenhum arquivo foi selecionado.");
        }
    }

    @FXML
    void cadastrarAlbum(ActionEvent event) throws IOException, SQLException {
        // Cria um novo objeto Album com os dados do formulário
        Album album = new Album(nome_album.getText(), data_album.getValue(), interprete_album.getText(), caminhoImagem.getText() );

        CadastroAlbum.salvarAlbum(album);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades4/album/album-view.fxml"));
        Parent root = fxmlLoader.load();

        // Cria nova Stage
        Stage stageCadastro = new Stage();
        stageCadastro.setTitle("Album");
        stageCadastro.initModality(Modality.APPLICATION_MODAL);
        stageCadastro.setScene(new Scene(root, 573, 248)); // Definindo largura e altura
        stageCadastro.show();

        // Obtém a Stage atual e a fecha
        Stage stage = (Stage) cadastrar_album.getScene().getWindow();
        stage.close();
    }

    @FXML
    void voltar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades4/album/album-view.fxml"));
        Parent root = fxmlLoader.load();

        // Cria nova Stage
        Stage stageCadastro = new Stage();
        stageCadastro.setTitle("Album");
        stageCadastro.initModality(Modality.APPLICATION_MODAL);
        stageCadastro.setScene(new Scene(root, 573, 248)); // Definindo largura e altura
        stageCadastro.show();

        // Obtém a Stage atual e a fecha
        Stage stage = (Stage) cadastrar_album.getScene().getWindow();
        stage.close();
    }


}
