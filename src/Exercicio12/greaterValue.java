//12.Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 
package Exercicio12;

//Criada a classe greaterValue e adicionado os dois atributos que receberão os numeros que serão comparados 
public class greaterValue {

	// utilizarei o método main para exibir as respostas
	public static void main(String[] Args) {
		// Defini números para as variáveis
		int Number1 = 192;
		int Number2 = 57;

		// Se a variavel 1 for maior que 2, dirá que a variavel 1 é maior
		if (Number1 > Number2) {
			System.out.println("O maior número é " + Number1);
		// Se não, dirá que a variavel 2 é maior
		} else {
			System.out.println("O maior número é " + Number2);
		}
	}
}
