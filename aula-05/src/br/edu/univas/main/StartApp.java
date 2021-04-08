package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		//escopo da variavel!
		int a = 23;

		if (a > 0) {
			if (a % 2 == 0) {
				System.out.println("Esse número é positivo e par!");
			} else {
				System.out.println("Esse número é positivo e ímpar!");
			}
			
		} else if (a < 0) {
			if (a % 2 == 0) {
				System.out.println("Esse número é negativo e par!");
			} else {
				System.out.println("Esse número é negativo e ímpar!");
			}
			
		} else {			
			System.out.println("Esse é zero!");
		}
	}
}
