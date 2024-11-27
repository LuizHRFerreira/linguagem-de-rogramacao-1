package org.example.models;


import java.sql.Date;
import java.time.LocalDate;

public class Album {

    private String nome;
    private String Interprete;
    private LocalDate dataDelancamento;
    private String capa;

    public Album(String nome, LocalDate dataDelancamento, String interprete, String capa) {
        this.nome = nome;
        this.dataDelancamento = dataDelancamento;
        this.Interprete = interprete;
        this.capa = capa;
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

    public String getCapa() {
        return capa;
    }

}
