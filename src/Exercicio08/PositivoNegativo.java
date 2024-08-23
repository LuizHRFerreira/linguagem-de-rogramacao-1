//08.Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 

package Exercicio08;

import java.util.Scanner;

//Criado a classe PositivoNegativo, não declaro o atributo agora, declaro apenas dentro do main 
public class PositivoNegativo {

	public static void main(String[] Args) {

		// Criado o scanner
		Scanner read = new Scanner(System.in);

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a variavel
		System.out.print("Informe um número: ");
		int Number = read.nextInt();

		// Aqui eu comparei o numero com 0 para saber se é maior ou menor. If (em
		// portugês "se") for maior que 0, segue oque está entre couchetes
		if (Number >= 0) {
			System.out.println("É POSITIVO!");
		}
		// Quando não for maior que 0, segue oque está nos couchetes de else
		else {
			System.out.println("É NEGATIVO");
		}

		read.close();
	}
}
