/**09.As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo 
 * menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da 
 * compra. */

package Exercicio09;

//Criada a classe Apples e adicionei o atributo amount que é a quantidade de maçãs compradas
public class Apples {
	private double amount;

	// Criação do construtor que vai adicionar a quantidade destinada ao objeto no
	// atributo amount
	public Apples(int amount) {
		this.amount = amount;
	}

	// Criação do metodo que vai fazer o calculo
	public double count() {
		// se a quantidade for maior que 12, vai seguir o if
		if (amount > 12) {
			return amount * 1;
		}
		// se a quantidade for menor que 12, sei seguir o else
		else {
			return amount * 1.30;
		}
	}

	//Uitilizarei o metodo main para exibir o resultado
	public static void main(String[] Args) {
		//criação do objeto value utilizando a classe Apples e adicionei um valor em amount
		Apples value = new Apples(7);
        // Exibir o valor total da compra formatado com 2 casas decimais  
		System.out.println("O valor total da compra é de R$"  + String.format("%.2f",value.count()));

	}

}