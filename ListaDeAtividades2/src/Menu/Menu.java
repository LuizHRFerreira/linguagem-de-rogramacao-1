package Menu;

import java.util.Scanner;

import Classes.Album;
import Classes.Animal;
import Classes.Bola;
import Classes.Carro;
import Classes.Casa;
import Classes.Felino;
import Classes.Flor;
import Classes.InstrumentoMusical;
import Classes.Pessoa;
import Classes.TimeDeFutebol;

public class Menu {

    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        int option;

        // Loop principal do menu
        do {
            // Exibe o menu de opções
            System.out.println("=========== Selecione o método que deseja reproduzir ===========");
            System.out.println(" [01] Album de musica");
            System.out.println(" [02] Animal");
            System.out.println(" [03] Bola");
            System.out.println(" [04] Carro");
            System.out.println(" [05] Casa");
            System.out.println(" [06] Felino");
            System.out.println(" [07] Flor");
            System.out.println(" [08] Instrumento Musical");
            System.out.println(" [09] Pessoa");
            System.out.println(" [10] Time de Futebol");
            System.out.println("");
            System.out.println(" [00] Finalizar programa");
            System.out.println("===========================================================");
            System.out.print("Resposta: ");
            System.out.println("");

            // Verifica se a entrada é um número inteiro válido
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
                System.out.print("Resposta: ");
            }

            // Lê a opção do usuário
            option = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer após nextInt()

            // Executa a opção escolhida
            switch (option) {
                case 1:
                    Album.executar(); // Chama o método executar da classe Album
                    break;
                case 2:
                    Animal.executar(); // Chama o método executar da classe Animal
                    break;
                case 3:
                    Bola.executar(); // Chama o método executar da classe Bola
                    break;
                case 4:
                    Carro.executar(); // Chama o método executar da classe Carro
                    break;
                case 5:
                    Casa.executar(); // Chama o método executar da classe Casa
                    break;
                case 6:
                    Felino.executar(); // Chama o método executar da classe Felino
                    break;
                case 7:
                    Flor.executar(); // Chama o método executar da classe Flor
                    break;
                case 8:
                    InstrumentoMusical.executar(); // Chama o método executar da classe InstrumentoMusical
                    break;
                case 9:
                    Pessoa.executar(); // Chama o método executar da classe Pessoa
                    break;
                case 10:
                    TimeDeFutebol.executar(); // Chama o método executar da classe TimeDeFutebol
                    break;
                case 0:
                    // Mensagem de despedida ao usuário
                    System.out.println("Obrigado por usar o programa! Até a próxima!");
                    break;
                default:
                    // Mensagem de erro para opções inválidas
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (option != 0); // Continua o loop até que a opção 0 seja escolhida

        // Fecha o Scanner
        scanner.close();
    }
}
