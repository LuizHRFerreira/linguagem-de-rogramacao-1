//13 Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package Exercicio13;

import java.util.Scanner;

//Criada a classe greaterValue e adicionado os dois atributos que receberão os numeros que serão comparados 
public class ascending0rder {

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

		// Se a variavel 1 for maior que 2, seguirá o IF
		if (Number1 > Number2) {
			System.out.println("A ordem crescente é " + Number1 + ", " + Number2);
			// Se não, seguirá o else
		} else {
			System.out.println("A ordem crescente é " + Number2 + ", " + Number1);
		}
		read.close();
	}

}
