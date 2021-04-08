package br.edu.univas.exercicios;

public class Questao6 {

	public static void main(String[] args) {
		float precoGasolina = 16.65f;
		float precoEtanol = 5.25f;
		
		float resultado = precoEtanol / precoGasolina * 100;	
		
		if (resultado > 70) {
			System.out.println("Gasolina");
		} else {
			System.out.println("Etanol");
		}
	}
}
