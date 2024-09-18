package Classes;

import java.util.Scanner;

public class Bola {

    private String formato;
    private String esporte;
    private String cor;

    public Bola(String formato, String esporte, String cor) {
        this.formato = formato;
        this.esporte = esporte;
        this.cor = cor;
    }

    public String chutar() {
        return "Chutou a bola";
    }

    public String arremessar() {
        return "Arremessou a bola";
    }

    public String pegar() {
        return "Pegou a bola";
    }
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Bola ===========");
        System.out.println("Primeiramente, descreva a bola");
        System.out.print("Informe o formato da bola: ");
        String formato = scanner.nextLine();
        System.out.print("Informe o esporte associado à bola: ");
        String esporte = scanner.nextLine();
        System.out.print("Informe a cor da bola: ");
        String cor = scanner.nextLine();
        
        Bola bola = new Bola(formato, esporte, cor);
        
        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com a bola?");
            System.out.println("[01] Chutar");
            System.out.println("[02] Arremessar");
            System.out.println("[03] Pegá-la");
            System.out.println("[00] Sair");            
            System.out.println("");
            System.out.print("Resposta: ");
            
            // Verifica se a entrada é um número inteiro válido
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
                System.out.print("Resposta: ");
            }
            
            subOption = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer após nextInt()

            switch (subOption) {
                case 1:
                    System.out.println(bola.chutar());
                    break;
                    
                case 2:
                    System.out.println(bola.arremessar());
                    break;
                    
                case 3:
                    System.out.println(bola.pegar());
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
