/** 17.Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno.
 * Fórmula para cálculo de média de LP1.
(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.2)*/

package Exercicio17;

import java.util.Scanner;

//Criação da classe media e vinculada a ela todos os atributos que serão as notas a serem coletadas
public class media {
	private float prova1;
	private float exercicio1;
	private float exercicio2;
	private float api;
	private float extra;
	private float substituta;

	// Contrutor, quando chamado, vai coletar todos os valores fornecidos e
	// colocalos em seus devidos atributos
	public media(float prova1, float exercicio1, float exercicio2, float api, float extra, float substituta) {
		this.prova1 = prova1;
		this.exercicio1 = exercicio1;
		this.exercicio2 = exercicio2;
		this.api = api;
		this.extra = extra;
		this.substituta = substituta;
	}

	// Método nota é o calculo do valor da nota
	public double nota() {
		// Bolco 1: A prova1 vale 60% do total da nota, por isso multiplica por 0.6 e a
		// media da
		// nota do exercicio 1 e exercicio 2 valem os outros 40% da nota, por isso é
		// multiplicado por 0.4. O 100% da nota anteriormente calculada é 50% da nota
		// total, por conta disso é multiplpicado por 0.5. O maximo valor possível é 5.
		return (prova1 * 0.6 + ((exercicio1 + exercicio2) / 2) * 0.4) * 0.5

				// Bloco 2: Agora vai repetir o calculo do Bloco 1, porém ao invés de tirarmos
				// 50%
				// multiplicando por 0,5, nós vamos subtrair 5,9. O resultado tem valor máximo é
				// 4,1.
				// A função Math.max vai comparar qual valor é maior entre esse que acabamos de
				// calcular e 0. O valor que for maior vai ser acrescido ao valor calculado no
				// bloco 1
				+ (Math.max(((prova1 * 0.6 + ((exercicio1 + exercicio2) / 2) * 0.4) - 5.9), 0)

						// Bloco 3: Fazemos o exato mesmo cálculo do Bloco 2, porém, ao invéz de
						// comparar com o numero 0, o resultado vai ser multiplicado por 50% da nota da
						// API, somado o ponto extra que a professora pode, ou não adicionar na média e
						// 20% da nota total da prova substituta que é a prova de recuperação
						/ ((prova1 * 0.6 + ((exercicio1 + exercicio2) / 2) * 0.4) - 5.9)) * (api * 0.5)
				+ extra + (substituta * 0.2);
		// A nota final é o produto da divição da soma dos Blocos 1 e Bloco 2 pelo Bloco
		// 3. A nota máxima é 10. Pois caso o aluno tenha tirado nota máxima nas
		// atividades, prova e API, ele não terá ponto extra computado nem fará a prova
		// substituta
	}

	// Sera utilizado o método main para criação do objeto e exibição do resultado
	public static void main(String[] Args) {

		// Criado o scanner
		Scanner read = new Scanner(System.in);

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// primeira variavel
		System.out.print("Informe a nota da Prova 1: ");
		int NotaProva1 = read.nextInt();

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// segunda variavel
		System.out.print("Informe a nota do Exercicio 1: ");
		int NotaExercicio1 = read.nextInt();

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// terceira variavel
		System.out.print("Informe a nota do Exercicio 2: ");
		int NotaExercicio2 = read.nextInt();

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// quarta variavel
		System.out.print("Informe a nota da API: ");
		int NotaApi = read.nextInt();

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// quinta variavel
		System.out.print("Informe a nota Extra: ");
		int NotaExtra = read.nextInt();

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// sexta variavel
		System.out.print("Informe a nota da prova substituta: ");
		int NotaSubstituta = read.nextInt();

		System.out.println("");
		
		// Criação do objeto Media, foi chamada o construtor media e foi ditado os
		// valores
		media Media = new media(NotaProva1, NotaExercicio1, NotaExercicio2, NotaApi, NotaExtra, NotaSubstituta);
		// Exibe os resultados
		System.out.println("A média final será de " + Media.nota());
	
		read.close();
	}

}