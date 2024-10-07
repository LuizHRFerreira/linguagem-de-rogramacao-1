package org.example.listadeatividades3;


import java.util.Scanner;

public class Album {

    private String nome;
    private String dataDelancamento;
    private String Interprete;

    public Album(String nome, String dataDelancamento, String interprete) {
        this.nome = nome;
        this.dataDelancamento = dataDelancamento;
        this.Interprete = interprete;
        System.out.println("teste");
    }

    public String ouvir() {
        return "Começou a tocar o álbum";
    }

    public String pausar() {
        return "Pausou a música";
    }

    public String baixar() {
        return "O álbum está sendo baixado";
    }

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Album de música ===========");
        System.out.println("Primeiramente, descreva o álbum");
        System.out.print("Informe o nome do álbum: ");
        String nome = scanner.nextLine();
        System.out.print("Informe a data de lançamento: ");
        String dataDelancamento = scanner.nextLine();
        System.out.print("Informe o intérprete: ");
        String Interprete = scanner.nextLine();

        Album album = new Album(nome, dataDelancamento, Interprete);

        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com o álbum " + album.nome + "?");
            System.out.println("[01] Ouvir");
            System.out.println("[02] Pausar");
            System.out.println("[03] Baixar");
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
                    System.out.println(album.ouvir());
                    break;

                case 2:
                    System.out.println(album.pausar());
                    break;

                case 3:
                    System.out.println(album.baixar());
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
