public class Album {

    private String nome;
    private String dataDelancamento;
    private String Interprete;

    public Album(String nome, String dataDelancamento, String interprete) {
        this.nome = nome;
        this.dataDelancamento = dataDelancamento;
        this.Interprete = interprete;
    }

    public String ouvir(){
        return "Começou a tocar o álbum";
    }

    public String pausar(){
        return "Pausou a musica";
    }

    public String Baixar(){
        return "O Album foi baixado";
    }
}
