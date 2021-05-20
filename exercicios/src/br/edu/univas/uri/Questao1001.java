package br.edu.univas.uri;

import java.util.Scanner;

public class Questao1001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("X = " + (a + b));

		scanner.close();
	}
}
