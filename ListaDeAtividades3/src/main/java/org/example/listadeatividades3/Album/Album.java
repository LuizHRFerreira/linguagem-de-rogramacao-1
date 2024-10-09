package org.example.listadeatividades3.Album;


public class Album {

    private String nome;
    private String dataDelancamento;
    private String Interprete;

    public Album(String nome, String dataDelancamento, String interprete) {
        this.nome = nome;
        this.dataDelancamento = dataDelancamento;
        this.Interprete = interprete;
    }

    public static String ouvir() {

        return "Começou a tocar o álbum";
    }

    public static String pausar() {

        return "Pausou a música";
    }

    public static String baixar() {

        return "O álbum está sendo baixado";
    }

    public String getTitulo() {
    return nome;
    }

    public String getInterprete() {
    return Interprete;
    }

    public String getDataLancamento() {
        return dataDelancamento;
    }

}
