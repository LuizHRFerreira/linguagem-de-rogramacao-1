/**5. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma 
 comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um 
 algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o 
 valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

Ler:
- Número de carros por ele vendidos;
- valor total de suas vendas;
- Salário fixo
- valor que ele recebe por carro vendido

Salario total do colaborador:
Salário fixo + comissão (Quantidade de carro vendido * Valor por carro vendido) + 5% vendas efetuadas */

package Exercicio05;

//Criei a classe "Salario Final"

import java.util.Scanner;

public class SalarioFinal {

	// Aqui dei os atributos a classe, vai coletar todos as informações para efetuar
	// o cálculo

	private double Salario;
	private int QuantCarroVendido;
	private double ValVendas;
	private double ComPorCarro;

	// Criação do contrutor que vai vincular todas os valores do objeto para seus
	// respectivos atributos
	public SalarioFinal(double Salario, int QuantCarroVendido, double ValVendas, double ComPorCarro) {
		this.Salario = Salario;
		this.QuantCarroVendido = QuantCarroVendido;
		this.ValVendas = ValVendas;
		this.ComPorCarro = ComPorCarro;
	}

	// Criação do método que realizará o cálculo especificado pelo enunciado
	public double Montante() {
		return Salario + (QuantCarroVendido * ComPorCarro) + (ValVendas * 0.05);
	}

	// Aqui criei o main que vai criar um objeto e exibindo ele na tela
	public static void main(String[] Args) {

		Scanner read = new Scanner(System.in);
		System.out.println("============================== Cálculo de Salário do vendedor de carros ==============================");  
		System.out.println("Este programa irá cálcular o valor total do salário que o vendedor de carros receberá.");  
		System.out.println("");

		System.out.print("Informe o valor do salário: R$");
		double salario = read.nextDouble();

		System.out.print("Informe a quantidade de carros vendidos: ");
		int QuantCarroVendido = read.nextInt();

		System.out.print("Informe o valor total das vendas: R$");
		double ValVendas = read.nextDouble();

		System.out.print("Informe a comissão fixa por carro vendido: R$");
		double ComPorCarro = read.nextDouble();

		// Criei objeto que chamei de Valor da classe ValCar e acionei o contrutor para
		// colocar o valor de 100 no atributo factoryCost
		SalarioFinal MontanteTotal = new SalarioFinal(salario, QuantCarroVendido, ValVendas, ComPorCarro);

		// Exibe o resultado do código na tela
		System.out.println("");
		System.out.println("O valor total do salário do colaborador será de R$" + String.format("%.2f",MontanteTotal.Montante()));
	
		read.close();
	}

}
