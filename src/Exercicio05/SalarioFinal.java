//1. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma 
// comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um 
// algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o 
// valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

//(numero de carros / Valor total de vendas)  * 5% + salario fixo

package Exercicio05;

//Criei a classe "Salario Final"
public class SalarioFinal{	
      
	//Aqui dei os atributos a classe, vai ser os valores que eu vou coletar para o objeto e dele fazer o calculo
	   private float Salario;
	   private float QuantCarroVendido;
	   private float ValCarrosVendidos;

      public SalarioFinal(float Salario, float QuantCarroVendido, float ValCarrosVendidos){
          this.Salario = Salario;
          this.QuantCarroVendido = QuantCarroVendido;
          this.ValCarrosVendidos = ValCarrosVendidos;
      }
      
      public double Montante(){
      	return Salario + (ValCarrosVendidos / QuantCarroVendido) * 0.05;
      }
      
      public static void main (String[] Args){
      	
          SalarioFinal MontanteTotal = new SalarioFinal(2100,5,300000);
   
          System.out.println("O valor total do salário do colaborador será de R$" + MontanteTotal.Montante());
      }
      
  }
