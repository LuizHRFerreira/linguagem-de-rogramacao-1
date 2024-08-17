//01. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 

package Exercicio01;

// Cria a classe que eu chamei de Age
public class Age {
    
   private int years;
   private int months;
   private int days;

// Aqui cria o construtor que esta definindo os atributos de years, mounths e days como inteiros) 
   public Age (int years, int mounths, int days){
       this.years = years;
       this.months = months;
       this.days = days;
   }

//Está criando o método que chamei de convert, a forma que vai ser calculado o valor que eu quero
//nesse caso, transforma tudo em dia e depois soma

   public int convert(){
       return days + (months * 30 + years * 365);
   }
   
//Agora vai chamar o metodo e utiliza-lo em cima do objeto que eu vou criar    
   public static void main(String[] args){

//Criei objeto person1 e dei os atributos de Age para ele        
       Age person1 = new Age(22, 9, 1);

//Exibe o resultado        
       System.out.println("Total de dias: " + person1.convert());
       
   }

}
