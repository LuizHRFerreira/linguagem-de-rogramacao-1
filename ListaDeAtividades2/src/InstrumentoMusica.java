public class InstrumentoMusica {

    private String modelo;
    private String formato;
    private String afinacao;

    public String tocar(){
        return "O instrumento está sendo tocado";
    }

    public String afinar(){
        return "O instrumento está afinado";
    }

    public String compor(){
        return "Uma musica foi composta no instrumento";
    }
}
