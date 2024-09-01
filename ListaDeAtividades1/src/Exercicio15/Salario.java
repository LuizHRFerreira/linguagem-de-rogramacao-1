/**15.A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 
 * horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um 
 * algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do
 * funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês
 * possua 4 semanas exatas). */

package Exercicio15;

import java.util.Scanner;

// Criada a classe Salario e atribuida atributos que são informações que receberemos do objeto
public class Salario {
	private float HrsTrab;
	private float ValHora;

	// Criação do construtor, vai sertificar que todos os valores forsecidos sejam
	// designados para os atributos corretos
	public Salario(float HrsTrab, float ValHora) {
		this.HrsTrab = HrsTrab;
		this.ValHora = ValHora;
	}

	// O método vai verificar se o colaborar trabalhou o total previsto no mês (4
	// semanas * 40 horas semanais = 160 horas mensais)
	public double ValSal() {
		// Caso ele tenha feito a mais que o máximo, ele entrará no if e serão
		// acrescentado os 160 horas com o valor normal. Então é calculado o total de
		// horas a mais que o colaborador fez, esse tempo verificamos quanto representa
		// monitariamente e somamos 50% desse valor ao montante total
		if (HrsTrab > 160) {
			return 160 * ValHora + (((HrsTrab - 160) * ValHora) * 0.5);
		}
		// Caso ele tenha feito menos ou igual ao previsto, o salario dele será
		// calculado normalmente
		else {
			return HrsTrab * ValHora;
		}
	}

	public static void main(String[] Args) {
		
		// Criado o scanner
		Scanner read = new Scanner(System.in);

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// primeira variavel
		System.out.print("Informe o total de horas trabalhadas: ");
		int HrsTrab = read.nextInt();

		// Vai mostrar o enunciado e pedir que o usuário deigite a resposta para a
		// segunda variavel
		System.out.print("Informe o valor que o colaboradore recebe por horas: ");
		int ValHora = read.nextInt();

		// Criado o objeto e vinculado os valores lidos para os atributos do objeto
		Salario SalLiq = new Salario(HrsTrab, ValHora);
		
		System.out.println("");
		System.out.println("O salário total do colaborador será de R$"+ String.format("%.2f",SalLiq.ValSal()));
		
		read.close();
	}
}
