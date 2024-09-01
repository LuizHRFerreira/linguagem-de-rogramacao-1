import java.util.Date;

public class Pessoa {

    private String nome;
    private String genero;
    private Date dataDenascimento;

    public String andar(){
        return "A pessoa está andando";
    }

    public String falar(){
        return "A pessoa está falando";
    }

    public String dormir(){
        return "A pessoa está dormindo";
    }
}
