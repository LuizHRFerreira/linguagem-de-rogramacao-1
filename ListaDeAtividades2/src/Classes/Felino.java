package Classes;

import java.util.Scanner;

public class Felino {

    private String especie;
    private String tamanho;
    private String cor;

    public Felino(String especie, String tamanho, String cor) {
        this.especie = especie;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String dormir() {
        return "O animal está dormindo";
    }

    public String comer() {
        return "O animal está comendo";
    }

    public String alongar() {
        return "O animal está se alongando";
    }
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Felino ===========");
        System.out.println("Primeiramente, descreva o felino");
        System.out.print("Informe a espécie do felino: ");
        String especie = scanner.nextLine();
        System.out.print("Informe o tamanho do felino: ");
        String tamanho = scanner.nextLine();
        System.out.print("Informe a cor do felino: ");
        String cor = scanner.nextLine();
        
        Felino felino = new Felino(especie, tamanho, cor);
        
        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com o felino?");
            System.out.println("[01] Dormir");
            System.out.println("[02] Comer");
            System.out.println("[03] Alongar");
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
                    System.out.println(felino.dormir());
                    break;
                    
                case 2:
                    System.out.println(felino.comer());
                    break;
                    
                case 3:
                    System.out.println(felino.alongar());
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
        scanner.close();
    }
}
