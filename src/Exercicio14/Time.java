/**14.Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os 
 * minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24
 * horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */

package Exercicio14;

// Criação da classe Time aonde definiremos os atributos
public class Time {
	private int start;
	private int end;

	// Construtor, vai designar os valores aos respectivos atributos
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}

	// Verifica se a partida termina no mesmo dia que começo
	public int stopwatch() {
		if (start < end) {
			return end - start;
		}
		// Caso a hora do fim seja menos que a hora do inicio, quer dizer que a partida
		// acabou dia seguinte, por conta disso é realizada a compensação de horas
		// adicionando mais 24h ao total
		else {
			return end - start + 24;
		}
	}

	// Utilização do mérodo mais para exibir o resultado
	public static void main(String[] Args) {
		// Criação do objeto chamado de game
		Time game = new Time(19, 15);
		System.out.println("O jogo teve a duração de " + game.stopwatch() + " Horas");
	}

}
