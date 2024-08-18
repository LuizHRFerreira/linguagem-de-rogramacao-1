/**Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário 
 * escrever NÃO É MAIOR QUE 10! */

package Exercicio07;

// Criado a classe MaiorMenor, dessa vez eu não declaro o atributo agora, declaro apenas dentro do main 
public class MaiorMenor {
	
	public static void main (String[] Args) {
	
		//Aqui eu declarei o atributo e já atribuí um valor a ele
	float num = 99;	
	//Aqui eu comparei o numero com 10 para saber se é maior ou menor. If (em portugês "se") for maior que 10, segue oque está entre couchetes
	if (num > 10) {
		System.out.println("É MAIOR QUE 10!");
		}
	//Quando não for maior que 10, segue oque está nos couchetes de else
	else {
		System.out.println("NÃO É MAIOR QUE 10");
		}
	}
}