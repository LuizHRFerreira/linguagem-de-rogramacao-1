//12.Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 
package Exercicio12;

import java.util.Scanner;

//Criada a classe greaterValue e adicionado os dois atributos que receberão os numeros que serão comparados 
public class greaterValue {

	// utilizarei o método main para exibir as respostas
	public static void main(String[] Args) {

		// Criado o scanner
		Scanner read = new Scanner(System.in);

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// primeira variavel
		System.out.print("Informe um número: ");
		int Number1 = read.nextInt();

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// segunda variavel
		System.out.print("Informe outro número: ");
		int Number2 = read.nextInt();

		// Se a variavel 1 for maior que 2, dirá que a variavel 1 é maior
		if (Number1 > Number2) {
			System.out.println("O maior número é " + Number1);
			// Se não, dirá que a variavel 2 é maior
		} else {
			System.out.println("O maior número é " + Number2);
		}
		read.close();
	}
}
