package CalculadoraDeFracao;

import java.util.Scanner;

public class MenuCalculadora {

    public static void main(String[] args) {

        // Cria um scanner para leitura de entradas do usuário
        Scanner scanner = new Scanner(System.in);
        int option; // Armazena a opção escolhida pelo usuário
        boolean run = true; // Flag para controlar o loop principal

        while (run) {
            // Exibe o menu de operações disponíveis
            System.out.println("========= bem vindo a calculadora de frações =========");
            System.out.println("Digite a operação desejada:");
            System.out.println("");
            System.out.println("[1] Soma de Frações");
            System.out.println("[2] Subtração de Frações");
            System.out.println("[3] Divisão de Frações");
            System.out.println("[4] Multiplicação de Frações");
            System.out.println("[0] Sair");
            System.out.println("");
            System.out.print("Resposta: ");

            // Lê a opção escolhida pelo usuário
            option = scanner.nextInt();

            switch (option) {
                case 1: {
                	Soma.main(args);
                    break;
                }

                case 2: {
                    Subtracao.main(args);
                    break;
                }

                case 3: {
                   Divisao.main(args);
                    break;
                }

                case 4: {
                    // Multiplicação de frações
                	Multiplicacao.main(args);
                	break;
                }

                case 0: {
                    // Fecha o programa
                    run = false;
                    System.out.println("Fechando o programa...");
                    break;
                }

                default: {
                    // Mensagem de erro para opções inválidas
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
