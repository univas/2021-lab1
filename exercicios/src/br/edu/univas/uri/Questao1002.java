package br.edu.univas.uri;

import java.util.Scanner;

public class Questao1002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double r = scanner.nextDouble();
		double n = 3.14159;
		double area = n * (r * r);
		
		System.out.println(String.format("A=%.4f", area));

		scanner.close();
	}
}
