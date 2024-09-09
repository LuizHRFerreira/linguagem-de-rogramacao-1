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
            System.out.println("Escolha a operação que deseja realizar:");
            System.out.println("[1] Soma de Frações");
            System.out.println("[2] Subtração de Frações");
            System.out.println("[3] Divisão de Frações");
            System.out.println("[4] Multiplicação de Frações");
            System.out.println("[0] Fechar");

            // Lê a opção escolhida pelo usuário
            option = scanner.nextInt();

            switch (option) {
                case 1: {
                    // Soma de frações
                    System.out.println("Para atribuir os valores da fração, digite primeiro o numerador e depois o denominador!");

                    System.out.println("Digite a primeira fração da soma: ");
                    CalculadoraDeFracao fracao1 = new CalculadoraDeFracao(scanner.nextInt(), scanner.nextInt());
                    System.out.println("Digite a segunda fração da soma: ");
                    CalculadoraDeFracao fracao2 = new CalculadoraDeFracao(scanner.nextInt(), scanner.nextInt());

                    CalculadoraDeFracao soma = fracao1.somar(fracao2);
                    System.out.println("Resultado: " + soma);
                    break;
                }

                case 2: {
                    // Subtração de frações
                    System.out.println("Para atribuir os valores da fração, digite primeiro o numerador e depois o denominador!");

                    System.out.println("Digite a primeira fração da subtração: ");
                    CalculadoraDeFracao fracao1 = new CalculadoraDeFracao(scanner.nextInt(), scanner.nextInt());
                    System.out.println("Digite a segunda fração da subtração: ");
                    CalculadoraDeFracao fracao2 = new CalculadoraDeFracao(scanner.nextInt(), scanner.nextInt());

                    CalculadoraDeFracao subtracao = fracao1.subtrair(fracao2);
                    System.out.println("Resultado: " + subtracao);
                    break;
                }

                case 3: {
                    // Divisão de frações
                    System.out.println("Para atribuir os valores da fração, digite primeiro o numerador e depois o denominador!");

                    System.out.println("Digite a primeira fração da divisão: ");
                    CalculadoraDeFracao fracao1 = new CalculadoraDeFracao(scanner.nextInt(), scanner.nextInt());
                    System.out.println("Digite a segunda fração da divisão: ");
                    CalculadoraDeFracao fracao2 = new CalculadoraDeFracao(scanner.nextInt(), scanner.nextInt());

                    CalculadoraDeFracao divisao = fracao1.dividir(fracao2);
                    System.out.println("Resultado: " + divisao);
                    break;
                }

                case 4: {
                    // Multiplicação de frações
                    System.out.println("Para atribuir os valores da fração, digite primeiro o numerador e depois o denominador!");

                    System.out.println("Digite a primeira fração da multiplicação: ");
                    CalculadoraDeFracao fracao1 = new CalculadoraDeFracao(scanner.nextInt(), scanner.nextInt());
                    System.out.println("Digite a segunda fração da multiplicação: ");
                    CalculadoraDeFracao fracao2 = new CalculadoraDeFracao(scanner.nextInt(), scanner.nextInt());

                    CalculadoraDeFracao multiplicacao = fracao1.multiplicar(fracao2);
                    System.out.println("Resultado: " + multiplicacao);
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
