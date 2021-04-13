package br.edu.univas;

public class Questao1 {

	public static void main(String[] args) {
		int a1 = 2;
		int a2 = -99;
		int a3 = 3;
		int a4 = -8;
		int a5 = 1;
		
		int contador = 0;
		if (a1 < 0) {
			++contador;
		}
		if (a2 < 0) {
			++contador;
		}
		if (a3 < 0) {
			contador++;
		}
		if (a4 < 0) {
			contador++;
		}
		if (a5 < 0) {
			contador++;
		}
		
		System.out.println("A quantidade de numeros negativos é: " + contador);
	}
	
}
