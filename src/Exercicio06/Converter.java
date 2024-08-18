/**06.Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor 
correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 
100°C = 212°F 

Para converter 1 grau Celsius (°C) para Fahrenheit (°F), usamos a fórmula:
F = ( C × 1.8) + 32 */

package Exercicio06;

	// Criei a classe chamada Converter
public class Converter {

	// Criei o atributo celsios dentro da classe Converter
	private int celsius;

	// Criei um contrutor chamado Converter que vai adicionar o valor que eu
	// destinar ao objeto à variavel celsios
	public Converter(int celsios) {
		this.celsius = celsios;
	}

	// Criei um método chamado Fahrenheit que vai utilizar a formula para converter Celsius para Fahrenheit
	public double Fahrenheit() {
		return (celsius * 1.8) + 32;
	}

	//Aqui criei o main que vai criar um objeto e exibindo ele na tela
	public static void main(String[] Args) {
		//Criei objeto que chamei de resultado da classe Converter e acionei o contrutor para colocar o valor de 100 no atributo celsius
		Converter resultado = new Converter(167);
		//Exibe o resultado da conversao
		System.out.println("O valor de " + resultado.celsius + "ºC é igual a " + resultado.Fahrenheit() + "ºF");
	}
}
