package Classes;

import java.util.Scanner;

public class InstrumentoMusical {

    private String modelo;
    private String formato;
    private String afinacao;

    public InstrumentoMusical(String modelo, String formato, String afinacao) {
        this.modelo = modelo;
        this.formato = formato;
        this.afinacao = afinacao;
    }

    public String tocar() {
        return "O instrumento está sendo tocado";
    }

    public String afinar() {
        return "O instrumento está afinado";
    }

    public String compor() {
        return "Uma música foi composta no instrumento";
    }
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Instrumento Musical ===========");
        System.out.println("Primeiramente, descreva o instrumento musical");
        System.out.print("Informe o modelo do instrumento: ");
        String modelo = scanner.nextLine();
        System.out.print("Informe o formato do instrumento: ");
        String formato = scanner.nextLine();
        System.out.print("Informe a afinação do instrumento: ");
        String afinacao = scanner.nextLine();
        
        InstrumentoMusical instrumento = new InstrumentoMusical(modelo, formato, afinacao);
        
        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com o instrumento musical?");
            System.out.println("[01] Tocar");
            System.out.println("[02] Afinar");
            System.out.println("[03] Compor");
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
                    System.out.println(instrumento.tocar());
                    break;
                    
                case 2:
                    System.out.println(instrumento.afinar());
                    break;
                    
                case 3:
                    System.out.println(instrumento.compor());
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
