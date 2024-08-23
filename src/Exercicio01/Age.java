//01. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
// dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 

package Exercicio01;

import java.util.Scanner;

// Cria a classe que eu chamei de Age
public class Age {
    
   private int years;
   private int months;
   private int days;

// Aqui cria o construtor que esta definindo os atributos de years, mounths e days como inteiros) 
   public Age (int days, int months, int years){
       this.days = days; 
       this.months = months;
       this.years = years;
   }

//Está criando o método que chamei de convert, a forma que vai ser calculado o valor que eu quero
//nesse caso, transforma tudo em dia e depois soma

   public int convert(){
       return days + (months * 30 + years * 365);
   }
   
//Agora vai chamar o metodo e utiliza-lo em cima do objeto que eu vou criar    
   public static void main(String[] args){

      Scanner read = new Scanner(System.in);

      System.out.println("============================== Cálculo da Idade em Dias ==============================");  
      System.out.println("Este programa irá converter sua idade expressa em anos, meses e dias para apenas dias.");  
      System.out.println("");

      System.out.print("");
      System.out.print("Insira a quantidade de dias: ");
      int days = read.nextInt();

      System.out.print("Insira a quantidade de meses: ");
      int months = read.nextInt();

      System.out.print("Insira a quantidade de anos: ");
      int years = read.nextInt();

      System.out.println("");

//Criei objeto person1 e dei os atributos de Age para ele        
       Age person1 = new Age(days, months, years);

//Exibe o resultado        
       System.out.println("Total de dias: " + person1.convert());
    
   read.close();

   }

}
