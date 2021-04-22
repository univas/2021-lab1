package br.edu.univas;

public class Questao2 {

	public static void main(String[] args) {
		int a = 12;
		int b = 20;
		int c = 8;
				
		if (a == b || a == c || b == c) {//2 viagens
			System.out.println("Sim");
		} else if (a + b == c || a + c == b || b + c == a) {//3 viagens
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
	}
}
