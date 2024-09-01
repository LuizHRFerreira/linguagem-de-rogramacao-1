//04.O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e 
//dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os 
//impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo 
//final ao consumidor. 

package Exercicio04;

import java.util.Scanner;

//Criei a classe ValCar (Valor do carro)
public class ValCar{	
        
	//Criei um atributo "factoriCost" que vou dizer qual o valor do custo de fábrica do carro
        private double factoryCost;

     //Aqui criei um construtor chamado ValCar, então quando alguém chamar ele, vai seguir essa ordem que está em parenteses
        public ValCar(double factoryCost){
            this.factoryCost = factoryCost;
        }
        
     //Criei método que vai calcular o valor do carro novo e chamei de "newCar"    
        public double newCar(){
        	return factoryCost + (0.28 * factoryCost) + (0.45 * factoryCost);
        }
        
     //Aqui criei o main que vai criar um objeto e exibindo ele na tela
        public static void main (String[] Args){
        	

         Scanner read = new Scanner(System.in);

         System.out.println("============= Calculo de valor de venda de carro =============");  
         System.out.println("Este programa irá calcular o valor final de venda do carro considerando os custos de fabricação, impostos e porcentagem da distribuidora.");  
         System.out.println("");     

         System.out.print("Insira o valor de custo do carro: R$");
         double factoryCost = read.nextFloat();
         
     //Criei objeto que chamei de Valor da classe ValCar e acionei o contrutor para colocar o valor de 100 no atributo factoryCost
            ValCar Valor = new ValCar(factoryCost);
     
            //Exibe valor calculado na tela
            System.out.println("O valor do custo final do carro novo é de R$" + Valor.newCar());
        
            read.close();
         }
    }