/** 17.Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno.
 * Fórmula para cálculo de média de LP1.
(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P2*0.6+((E3+E4)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.2)*/

package Exercicio17;

public class media {

	private float Prova1;
	private float exercicio1;
	private float exercicio2;
	private float maxi;
	private float Prova2;
	private float exercicio3;
	private float exercicio4;
	private float api;
	private float x;
	private float substituta;

	public media(float Prova1, float exercicio1, float exercicio2, float maxi, float Prova2, float exercicio3,
			float exercicio4, float api, float x, float substituta) {
		this.Prova1 = Prova1;
		this.exercicio1 = exercicio1;
		this.exercicio2 = exercicio2;
		this.maxi = maxi;
		this.Prova2 = Prova2;
		this.exercicio3 = exercicio3;
		this.exercicio4 = exercicio4;
		this.api = api;
		this.x = x;
		this.substituta = substituta;
	}

	public double nota() {
		return (Prova1*0.6+((exercicio1+exercicio2)/2)*0.4)*0.5+(maxi*(((Prova2*0.6+((exercicio3+exercicio4)/2)*0.4)-5.9))/((Prova1*0.6+((exercicio1+exercicio2)/2)*0.4)-5.9))*(api*0.5)+x+(substituta*0.2);
	}

	public static void main(String[] Args) {
		media Media = new media(10,10,10,10,10,10,10,10,10,10);
		System.out.println(Media.nota());
	}
	
}
