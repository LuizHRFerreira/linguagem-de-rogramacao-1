//02.Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 

package Exercicio02;

//Cria classe que eu chamei de Eleitores. Criei os atributos que vão coletar os numeros que serão informados

public class Eleitores {

 private float total;
 private float validos;
 private float brancos;
 private float nulos;

//Criei um construtor e dei caracterísiticas para cada um dos atributos 
 public Eleitores(float total, float validos, float brancos, float nulos) {

     this.total = total;
     this.validos = validos;
     this.brancos= brancos;
     this.nulos = nulos;

 }

//Estou realizando a função, divide o valo do total e multiplica por 100 para ter o resultado em porcentagem
 public float porcentagemValidos() {

     return validos / total * 100;

 }

//Estou realizando a função, divide o valo do total e multiplica por 100 para ter o resultado em porcentagem
 public float porcentagemBrancos() {

     return brancos / total * 100;

 }

//Estou realizando a função, divide o valo do total e multiplica por 100 para ter o resultado em porcentagem    
 public float porcentagemNulos(){
     return nulos / total * 100;
 }

//Esse é o main, ele é o programa rodando

 public static void main(String[] args) {

//Criei o objeto Eleição seguindo a classe de Eleitores e dei valores aos atributos
     Eleitores Eleicao = new Eleitores(100, 50, 25, 30);

//Printa em linhas diferentes os resultados respectivos
     System.out.println("Total de eleitores: " + Eleicao.total);
     System.out.println("Votos validos: "+ String.format("%.2f",Eleicao.porcentagemValidos()) +"%"); 
     System.out.println("Votos brancos: "+ String.format("%.2f",Eleicao.porcentagemBrancos()) +"%"); 
     System.out.println("Votos nulos: " + String.format("%.2f",Eleicao.porcentagemNulos()) +"%"); 

 }

}