package Classes;

import java.util.Scanner;

public class Carro {

    private String modelo;
    private String fabricante;
    private String cor;

    public Carro(String modelo, String fabricante, String cor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
    }

    public String ligar() {
        return "Carro ligado";
    }

    public String desligar() {
        return "Carro desligado";
    }

    public String acelerar() {
        return "O carro está acelerando";
    }
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Carro ===========");
        System.out.println("Primeiramente, descreva o carro");
        System.out.print("Informe o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Informe o fabricante do carro: ");
        String fabricante = scanner.nextLine();
        System.out.print("Informe a cor do carro: ");
        String cor = scanner.nextLine();
        
        Carro carro = new Carro(modelo, fabricante, cor);
        
        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com o carro " + carro.modelo + "?");
            System.out.println("[01] Ligar");
            System.out.println("[02] Desligar");
            System.out.println("[03] Acelerar");
            System.out.println("[00] Sair");            
            System.out.println("");
            System.out.print("Resposta ");
            
            // Verifica se a entrada é um número inteiro válido
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
                System.out.print("Resposta ");
            }
            
            subOption = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer após nextInt()

            switch (subOption) {
                case 1:
                    System.out.println(carro.ligar());
                    break;
                    
                case 2:
                    System.out.println(carro.desligar());
                    break;
                    
                case 3:
                    System.out.println(carro.acelerar());
                    break;

                case 0:
                    // Saída do loop
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            if (subOption != 0) {
                System.out.println("Pressione Enter para continuar...");
                scanner.nextLine(); // Aguarda a entrada do usuário para continuar
            }

        } while (subOption != 0);
        
        System.out.println("Voltando ao menu principal...");
    }
}

