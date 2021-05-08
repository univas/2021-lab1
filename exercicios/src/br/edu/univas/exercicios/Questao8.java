package br.edu.univas.exercicios;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite o valor de X:");
		int x = leitura.nextInt();
		
		System.out.println("Por favor, digite o valor de Y:");
		int y = leitura.nextInt();
		
		int z = x;
		x = y;
		y = z;

		System.out.println("Valor de X: " + x + " e valor de Y: " + y);
		
		leitura.close();
	}
	
}
