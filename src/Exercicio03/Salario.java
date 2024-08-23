//03.Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 

package Exercicio03;

// Criei a classe Salario. Aqui eu dou os atributos que o objeto vai ter que ter, nesse caso Salario e porcAjuste, ambos numeros racionais

import java.util.Scanner;

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
    
    Scanner read = new Scanner(System.in);
    
    System.out.println("============= Calculo de reajuste salárial =============");  
    System.out.println("Este programa irá recalcular o novo valor salarial do colaborador baseado no salario atual e a aliquota de reajuste.");  
    System.out.println("");

    System.out.print("Informe o valor do salário atual: R$");
    float salario = read.nextFloat();

    System.out.print("Informe a aliquota de reajuste: ");
    float porcAjuste = read.nextFloat();

    Salario Valor = new Salario(salario,porcAjuste);
    
    System.out.println("");
    System.out.println("Valor do novo salario: R$" + String.format("%.2f",Valor.novSal()));
    
    read.close();
}

}