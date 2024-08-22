package exercicio_6;

public class Temperature{

    private double celsius;
    private double fahrenheit;


    public Temperature(float fah){

        this.fahrenheit = fah;

    }

    public double convert(){
        celsius = fahrenheit / 2.12;
        return(celsius);
    }

    public static void main(String[] Args){

        Temperature grau = new Temperature(82);

        System.out.println("A temperatura convertida é: " + grau.convert());

    }
    
}