/** 10.Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma 
 * mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é 
 * aprovado). Escrever também a média calculada.*/

package Exercicio10;

//Criado o objeto Aprovado e vinculado 2 atributos que serão as 2 notas que será incluido para o objeto
public class Aprovado {
	private double Nota1;
	private double Nota2;

	// Construtor, vai colocar as notas fornecidas as seus respectivos atributos
	public Aprovado(double Nota1, double Nota2) {
		this.Nota1 = Nota1;
		this.Nota2 = Nota2;
	}

	// Método faz o cálculo da média aritimética
	public double Media() {
		return (Nota1 + Nota2) / 2;
	}

	// Utilizarei o metodo main para exibir o resultado
	public static void main(String[] Arg) {
		// Criado objeto, chamado o contrutor e vinculadas as 2 notas
		Aprovado total = new Aprovado(10, 1);

		// se a média calculada pelo contrutor, for maior ou igual a 6 executa o if
		if (total.Media() >= 6) {
			System.out.println("APROVADO!");
			System.out.println("Média final: " + total.Media());
		}
		// se a média for menor que 6, executa o else
		else {
			System.out.println("REPROVADO!");
			System.out.println("Média final: " + total.Media());
		}
	}
}
