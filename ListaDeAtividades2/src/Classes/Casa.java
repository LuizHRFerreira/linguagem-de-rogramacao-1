package Classes;

import java.util.Scanner;

public class Casa {

    private float tamanho;
    private String cor;
    private String funcionalidade;

    public Casa(float tamanho, String cor, String funcionalidade) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.funcionalidade = funcionalidade;
    }

    public String entrar() {
        return "Entrou no prédio";
    }

    public String sair() {
        return "Saiu do prédio";
    }

    public String tocarCampainha() {
        return "Tocou a campainha";
    }
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Casa ===========");
        System.out.println("Primeiramente, descreva a casa");
        System.out.print("Informe o tamanho da casa (em metros quadrados): ");
        float tamanho = scanner.nextFloat();
        scanner.nextLine(); // Limpa o buffer após nextFloat()
        System.out.print("Informe a cor da casa: ");
        String cor = scanner.nextLine();
        System.out.print("Informe a funcionalidade da casa: ");
        String funcionalidade = scanner.nextLine();
        
        Casa casa = new Casa(tamanho, cor, funcionalidade);
        
        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com a casa?");
            System.out.println("[01] Entrar");
            System.out.println("[02] Sair");
            System.out.println("[03] Tocar Campainha");
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
                    System.out.println(casa.entrar());
                    break;
                    
                case 2:
                    System.out.println(casa.sair());
                    break;
                    
                case 3:
                    System.out.println(casa.tocarCampainha());
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
