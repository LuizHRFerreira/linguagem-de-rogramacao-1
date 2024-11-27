package org.example.controllers.album;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.dao.AlbumDAO;
import org.example.models.Album;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AlbumController {

    public static String albumSelecionado = "";

    @FXML
    private Button CadastAlbum;

    @FXML
    private ImageView CapaAlbum;

    @FXML
    private Button ExcluirAlbum;

    @FXML
    private ListView<String> ListaAlbum;

    @FXML
    void initialize() {
        carregarAlbuns();
    }

    private void carregarAlbuns() {
        AlbumDAO albumDAO = new AlbumDAO();
        List<String> albuns = albumDAO.listarAlbuns();

        ObservableList<String> observableList = FXCollections.observableArrayList(albuns);
        ListaAlbum.setItems(observableList);
    }

    @FXML
    private Button OuvirAlbum;

    @FXML
    void CadastAlbum(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades4/album/Cadastrar_album_view.fxml"));
        Parent root = fxmlLoader.load();

        // Cria nova Stage
        Stage stageCadastro = new Stage();
        stageCadastro.setTitle("Cadastrar Album");
        stageCadastro.initModality(Modality.APPLICATION_MODAL);
        stageCadastro.setScene(new Scene(root, 516, 277)); // Definindo largura e altura
        stageCadastro.show();


        // Obtém a Stage atual e a fecha
        Stage stage = (Stage) CadastAlbum.getScene().getWindow();
        stage.close();
    }

    @FXML
    void ExcluirAlbum(ActionEvent event) {
        String albumSelecionado = ListaAlbum.getSelectionModel().getSelectedItem();

        if (albumSelecionado == null) {
            System.out.println("Nenhum álbum foi selecionado para exclusão.");
            return;
        }

        // Usando o AlbumDAO para excluir o álbum no banco de dados
        AlbumDAO albumDAO = new AlbumDAO();
        boolean sucesso = albumDAO.excluirAlbum(albumSelecionado);

        if (sucesso) {
            System.out.println("Álbum excluído com sucesso.");
            carregarAlbuns(); // Atualiza a lista após a exclusão
        } else {
            System.out.println("Erro ao excluir o álbum.");
        }
    }

    @FXML
    void OuvirAlbum(ActionEvent event) throws IOException {

        albumSelecionado = ListaAlbum.getSelectionModel().getSelectedItem();
        if (albumSelecionado == null) {
            System.out.println("Nenhum álbum foi selecionado.");
            return; // Retorna se nenhum álbum foi selecionado
        }

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/listadeatividades4/album/ouvir_album_view.fxml"));
        Parent root = fxmlLoader.load();

        // Cria nova Stage
        Stage stageOuvir = new Stage();
        stageOuvir.setTitle("Ouvir Album");
        stageOuvir.initModality(Modality.APPLICATION_MODAL);
        stageOuvir.setScene(new Scene(root, 436, 369)); // Definindo largura e altura
        stageOuvir.show();

        // Cria uma instância de OuvirAlbumController e chama o método setAlbum
        OuvirAlbumController controller = fxmlLoader.getController();
        controller.setAlbum(albumSelecionado);

        // Obtém a Stage atual e a fecha
        Stage stage = (Stage) OuvirAlbum.getScene().getWindow();
        stage.close();
    }

}

