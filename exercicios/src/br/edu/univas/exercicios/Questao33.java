package br.edu.univas.exercicios;

import java.util.Scanner;

public class Questao33 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int[] values = new int[50];
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Por favor, digite um número:");
			values[i] = leitura.nextInt();
		}

		for (int i = 0; i < 50; i++) {
			boolean numeroRepetido = false;
			
			for (int j = 0; j < 50; j++) {
				if (i != j && values[i] == values[j]) {
					numeroRepetido = true;
					break;
				}
			}
			
			if (numeroRepetido) {
				System.out.println(values[i]);
			}
		}

		leitura.close();
	}
}
