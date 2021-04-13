package br.edu.univas;

public class Questao3 {

	public static void main(String[] args) {
		int numero = 7;
		
		if ( (numero + 1) % 5 == 0) {
			System.out.println(numero + 1);
		
		} else if ( (numero + 2) % 5 == 0) {
			System.out.println(numero + 2);
		
		} else {
			System.out.println(numero);
		}
	}
}
