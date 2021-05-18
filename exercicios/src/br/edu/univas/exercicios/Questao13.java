package br.edu.univas.exercicios;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int a = leitura.nextInt();
		int b = leitura.nextInt();
		int c = leitura.nextInt();
		int d = leitura.nextInt();
		
		int resultado = (a * b) - (c * d);
		System.out.println("O resultado é: " + resultado);
		
		leitura.close();
	}
	
}
