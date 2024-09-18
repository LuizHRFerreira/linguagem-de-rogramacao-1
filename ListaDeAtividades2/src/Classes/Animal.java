package Classes;

import java.util.Scanner;

public class Animal {

    private String especie;
    private String sexo;
    private String cor;

    public Animal(String especie, String sexo, String cor) {
        this.especie = especie;
        this.sexo = sexo;
        this.cor = cor;
    }
    
    public String correr() {
        return "O animal está correndo";
    }

    public String comer() {
        return "O animal está comendo";
    }

    public String acordar() {
        return "O animal acordou";
    }
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Animal ===========");
        System.out.println("Primeiramente, descreva o animal");
        System.out.print("Informe a espécie do animal: ");
        String especie = scanner.nextLine();
        System.out.print("Informe o sexo do animal: ");
        String sexo = scanner.nextLine();
        System.out.print("Informe a cor do animal: ");
        String cor = scanner.nextLine();
        
        Animal animal = new Animal(especie, sexo, cor);
        
        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com o animal " + animal.especie + "?");
            System.out.println("[01] Correr");
            System.out.println("[02] Comer");
            System.out.println("[03] Acordar");
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
                    System.out.println(animal.correr());
                    break;
                    
                case 2:
                    System.out.println(animal.comer());
                    break;
                    
                case 3:
                    System.out.println(animal.acordar());
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
