package CalculadoraDeFracao;

import java.util.Scanner;

public class Multiplicacao {
	
	public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("================= Bem vindo a multiplicação de frações! =================");
		 System.out.println("Para atribuir os valores da fração, digite primeiro o numerador e depois o denominador!");
        
		 System.out.println("");
         System.out.println("Digite a primeira fração da multiplicação: ");
         int numerador1 = scanner.nextInt();
         int denominador1 = scanner.nextInt();
         
         System.out.println("");
         System.out.println("Digite a segunda fração da soma: ");
         int numerador2 = scanner.nextInt();
         int denominador2 = scanner.nextInt();
         
         System.out.println("");
         int novoNumerador = numerador1 *  numerador2;
         int novoDenominador = denominador1 * denominador2;

         System.out.println("==================================");
         System.out.println("Resultado da multiplicação: " + novoNumerador + "/" + novoDenominador);
         
         System.out.println("Pressione Enter para voltar ao menu...");
         scanner.nextLine();

         System.out.println("");
	}

}

