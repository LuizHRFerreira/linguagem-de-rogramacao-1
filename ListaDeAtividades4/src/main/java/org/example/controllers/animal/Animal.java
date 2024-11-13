package org.example.listadeatividades4.animal;

public class Animal {

    private String especie;
    private String sexo;
    private String cor;

    public Animal(String especie, String sexo, String cor) {
        this.especie = especie;
        this.sexo = sexo;
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCor() {
        return cor;
    }

    public static String correr() {
        return "O animal está correndo";
    }

    public static String comer() {
        return "O animal está comendo";
    }

    public static String acordar() {
        return "O animal acordou";
    }
}
