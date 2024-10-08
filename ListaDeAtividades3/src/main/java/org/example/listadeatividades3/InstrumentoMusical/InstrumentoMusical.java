package org.example.listadeatividades3.InstrumentoMusical;

public class InstrumentoMusical {

    private static String modelo;
    private static String formato;
    private static String afinacao;

    public InstrumentoMusical(String modelo, String formato, String afinacao) {
        this.modelo = modelo;
        this.formato = formato;
        this.afinacao = afinacao;
    }

    public static String tocar() {
        return "O instrumento está sendo tocado";
    }

    public static String afinar() {
        return "O instrumento está afinado";
    }

    public static String compor() {
        return "Uma música foi composta no instrumento";
    }

    public static String getModelo() { return modelo; }

    public static String getFormato() { return formato; }

    public static String getAfinacao() { return afinacao; }

}
