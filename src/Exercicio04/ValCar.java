//04.O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e 
//dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os 
//impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo 
//final ao consumidor. 

package Exercicio04;

//Criei a classe ValCar (Valor do carro)
public class ValCar{	
        
	//Criei um atributo "factoriCost" que vou dizer qual o valor do custo de fábrica do carro
        private float factoryCost;

     //Aqui criei um construtor chamado ValCar, então quando alguém chamar ele, vai seguir essa ordem que está em parenteses
        public ValCar(float factoryCost){
            this.factoryCost = factoryCost;
        }
        
     //Criei método que vai calcular o valor do carro novo e chamei de "newCar"    
        public double newCar(){
        	return factoryCost + (0.28 * factoryCost) + (0.45 * factoryCost);
        }
        
     //Aqui criei o main que vai criar um objeto e exibindo ele na tela
        public static void main (String[] Args){
        	
     //Criei objeto que chamei de Valor da classe ValCar e acionei o contrutor para colocar o valor de 100 no atributo factoryCost
            ValCar Valor = new ValCar(100);
     
            //Exibe valor calculado na tela
            System.out.println("O valor do custo final do carro novo é de R$" + Valor.newCar());
        }
        
    }