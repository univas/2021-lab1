package br.edu.univas.exercicios;

public class Questao4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = a % b;
		
		if (c == 0) {
			System.out.println("Divisão de " + a + " por " + b + " é perfeita!");
		} else {
			System.out.println("Divisão de " + a + " por " + b + " sobra " + c);
		}		
	}
}
