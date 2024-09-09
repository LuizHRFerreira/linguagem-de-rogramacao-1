package Classes;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Pessoa {

    private String nome;
    private String genero;
    private Date dataDeNascimento;
    
    public Pessoa(String nome, String genero, Date dataDeNascimento) {
        this.nome = nome;
        this.genero = genero;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String andar() {
        return "A pessoa está andando";
    }

    public String falar() {
        return "A pessoa está falando";
    }

    public String dormir() {
        return "A pessoa está dormindo";
    }
    
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Pessoa ===========");
        System.out.println("Primeiramente, descreva a pessoa");
        System.out.print("Informe o nome da pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o gênero da pessoa: ");
        String genero = scanner.nextLine();
        System.out.print("Informe a data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();

        Date dataDeNascimento = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dataDeNascimento = dateFormat.parse(dataNascimentoStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Usando a data atual.");
            dataDeNascimento = new Date(); // Define a data atual em caso de erro
        }
        
        Pessoa pessoa = new Pessoa(nome, genero, dataDeNascimento);
        
        int subOption;
        do {
            System.out.println("");
            System.out.println("O que deseja fazer com a pessoa " + pessoa.nome + "?");
            System.out.println("[01] Andar");
            System.out.println("[02] Falar");
            System.out.println("[03] Dormir");
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
                    System.out.println(pessoa.andar());
                    System.out.println("Digite 0 para parar");
                    scanner.nextLine(); // Aguarda a entrada do usuário para continuar
                    break;
                    
                case 2:
                    System.out.println(pessoa.falar());
                    System.out.println("Digite 0 para parar");
                    scanner.nextLine(); // Aguarda a entrada do usuário para continuar
                    break;
                    
                case 3:
                    System.out.println(pessoa.dormir());
                    System.out.println("Digite 0 para parar");
                    scanner.nextLine(); // Aguarda a entrada do usuário para continuar
                    break;

                case 0:
                    // Saída do loop
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (subOption != 0);
        
        System.out.println("Voltando ao menu principal...");
        scanner.close();
    }
}
