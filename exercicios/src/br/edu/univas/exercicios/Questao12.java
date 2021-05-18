package br.edu.univas.exercicios;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome:");
		String nomeAluno = leitura.nextLine();
		
		int soma = 0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a nota:");
			soma += leitura.nextInt();
		}
			
		int media = soma / 4;
		if (media > 59) {
			System.out.println("Aprovado!"); 
		} else if (media >= 40) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		leitura.close();
	}

}
