package Classes;

import java.util.Scanner;

public class TimeDeFutebol {

    private String nome;
    private String paisDeOrigem;
    private String cores;

    public TimeDeFutebol(String nome, String paisDeOrigem, String cores) {
        this.nome = nome;
        this.paisDeOrigem = paisDeOrigem;
        this.cores = cores;
    }

    public String jogar() {
        return "O time está jogando";
    }

    public String treinar() {
        return "O time está em treinamento";
    }

    public String contratar() {
        return "O time contratou um novo jogador";
    }
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Time de Futebol ===========");
        System.out.println("Primeiramente, descreva o time de futebol");
        System.out.print("Informe o nome do time: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o país de origem do time: ");
        String paisDeOrigem = scanner.nextLine();
        System.out.print("Informe as cores do time: ");
        String cores = scanner.nextLine();
        
        TimeDeFutebol time = new TimeDeFutebol(nome, paisDeOrigem, cores);
        
        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com o time de futebol?");
            System.out.println("[01] Jogar");
            System.out.println("[02] Treinar");
            System.out.println("[03] Contratar");
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
                    System.out.println(time.jogar());
                    break;
                    
                case 2:
                    System.out.println(time.treinar());
                    break;
                    
                case 3:
                    System.out.println(time.contratar());
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
