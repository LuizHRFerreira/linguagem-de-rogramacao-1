//08.Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 

package Exercicio08;

//Criado a classe PositivoNegativo, não declaro o atributo agora, declaro apenas dentro do main 
public class PositivoNegativo {
	
	public static void main (String[] Args) {
	
	//Aqui eu declarei o atributo e já atribuí um valor a ele
	float num = -10;	
	//Aqui eu comparei o numero com 0 para saber se é maior ou menor. If (em portugês "se") for maior que 0, segue oque está entre couchetes
	if (num >= 0) {
		System.out.println("É POSITIVO!");
		}
	//Quando não for maior que 0, segue oque está nos couchetes de else
	else {
		System.out.println("É NEGATIVO");
		}
	}
}
