//13 Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package Exercicio13;

//Criada a classe greaterValue e adicionado os dois atributos que receberão os numeros que serão comparados 
public class ascending0rder {

	// utilizarei o método main para exibir as respostas
	public static void main(String[] Args) {
		// Defini números para as variáveis
		int Number1 = 192;
		int Number2 = 57;

		// Se a variavel 1 for maior que 2, seguirá o IF
		if (Number1 > Number2) {
			System.out.println("A ordem crescente é " + Number1 + ", " + Number2);
		// Se não, seguirá o else
		} else {
			System.out.println("A ordem crescente é " + Number2 + ", " + Number1);
		}
	}
}
