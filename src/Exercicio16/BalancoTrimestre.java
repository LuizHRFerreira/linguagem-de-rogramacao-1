/** 16.Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro 
 * trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro,
 * 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre
 *  e a média mensal de gastos. */

package Exercicio16;

public class BalancoTrimestre {

	// Como o enunciado já forneceu os valores fixos, podemos colocar tudo dentro do
	// main mesmo e já realizar a soma do total e calculo da média

	public static void main(String[] Args) {

		// Calculo do total de despesa do trimestre
		double TotalGasto = 15000 + 23000 + 17000;

		// Caldulo da média gasta
		double Media = TotalGasto / 3;

		// Exibe os resultados
		System.out.println("A dispesa do primeiro trimestre foi de R$" + String.format("%.2f", TotalGasto));
		System.out.println("A media mensal gastra no primeiro trimestre foi de R$" + String.format("%.2f", Media));
	}

}
