//03.Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 

package Exercicio03;

// Criei a classe Salario. Aqui eu dou os atributos que o objeto vai ter que ter, nesse caso Salario e porcAjuste, ambos numeros racionais
public class Salario {

private float Salario;
private float porcAjuste;

// Aqui criei um construtor, então quando alguém chamar ele, vai seguir essa ordem que está em parenteses
public Salario(float Salario, float porcAjuste){
    this.Salario = Salario;
    this.porcAjuste = porcAjuste;
}

public float novSal(){
    return Salario + (porcAjuste / 100 * Salario);
}

public static void main(String[] Args){
    
    Salario Valor = new Salario(100,10);
    
    System.out.println("O salario atual: R$" + String.format("%.2f",Valor.Salario));
    System.out.println("Porcentagem do reajuste: " + String.format("%.2f",Valor.porcAjuste) + "%");
    System.out.println("Valor do novo salario: R$" + String.format("%.2f",Valor.novSal()));
    
}

}