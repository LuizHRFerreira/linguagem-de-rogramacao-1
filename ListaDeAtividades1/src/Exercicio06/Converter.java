/**06.Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor 
correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 
100°C = 212°F 

Para converter 1 grau Celsius (°C) para Fahrenheit (°F), usamos a fórmula:
F = ( C × 1.8) + 32 */

package Exercicio06;

	// Criei a classe chamada Converter
public class Converter {

	// Criei o atributo celsios dentro da classe Converter
	private int fahrenheit;

	// Criei um contrutor chamado Converter que vai adicionar o valor que eu
	// destinar ao objeto à variavel fahrenheit
	public Converter(int fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	// Criei um método chamado Celsius que vai utilizar a formula para converter fahrenheit para Celsius
	public double Celsius() {
		return (fahrenheit-32)*5/9;
	}

	//Aqui criei o main que vai criar um objeto e exibindo ele na tela
	public static void main(String[] Args) {
		//Criei objeto que chamei de resultado da classe Converter e acionei o contrutor para colocar o valor de 100 no atributo fahrenheit
		Converter resultado = new Converter(167);
		//Exibe o resultado da conversao
		System.out.println("O valor de " + resultado.fahrenheit + "ºF é igual a " + resultado.Celsius() + "ºC");
	}
}
