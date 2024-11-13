package org.example.models;


import java.sql.Date;
import java.time.LocalDate;

public class Album {

    private String nome;
    private String Interprete;
    private LocalDate dataDelancamento;

    public Album(String nome, LocalDate dataDelancamento, String interprete) {
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

    public LocalDate getDataLancamento() {
        return dataDelancamento;
    }

}
