package Classes;

import java.util.Scanner;

public class Flor {

    private String especie;
    private String cor;
    private String preco;

    public Flor(String especie, String cor, String preco) {
        this.especie = especie;
        this.cor = cor;
        this.preco = preco;
    }

    public String nascer() {
        return "A flor nasceu!!";
    }

    public String crescer() {
        return "A flor cresceu!!";
    }

    public String reproduzir() {
        return "A flor espalhou as suas sementes!!";
    }
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Flor ===========");
        System.out.println("Primeiramente, descreva a flor");
        System.out.print("Informe a espécie da flor: ");
        String especie = scanner.nextLine();
        System.out.print("Informe a cor da flor: ");
        String cor = scanner.nextLine();
        System.out.print("Informe o preço da flor: ");
        String preco = scanner.nextLine();
        
        Flor flor = new Flor(especie, cor, preco);
        
        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com a flor?");
            System.out.println("[01] Nascer");
            System.out.println("[02] Crescer");
            System.out.println("[03] Reproduzir");
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
                    System.out.println(flor.nascer());
                    break;
                    
                case 2:
                    System.out.println(flor.crescer());
                    break;
                    
                case 3:
                    System.out.println(flor.reproduzir());
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
