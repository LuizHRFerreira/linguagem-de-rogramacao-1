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
public class SalarioFinal {

	// Aqui dei os atributos a classe, vai coletar todos as informações para efetuar
	// o cálculo

	private float QuantCarroVendido;
	private float ValVendas;
	private float Salario;
	private float ComPorCarro;

	// Criação do contrutor que vai vincular todas os valores do objeto para seus
	// respectivos atributos
	public SalarioFinal(float Salario, float QuantCarroVendido, float ValVendas, float ComPorCarro) {
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

		// Criei objeto que chamei de Valor da classe ValCar e acionei o contrutor para
		// colocar o valor de 100 no atributo factoryCost
		SalarioFinal MontanteTotal = new SalarioFinal(1500, 3, 24000, 940);

		// Exibe o resultado do código na tela
		System.out.println("O valor total do salário do colaborador será de R$" + MontanteTotal.Montante());
	}

}
