package br.edu.univas.exercicios;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int anoNascimentoDoMaisVelho = 0;
		String nomeDoMaisVelho = "";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome: ");
			String nome = leitura.nextLine();
			
			System.out.println("Digite o ano de nascimento: ");
			int anoNascimento = leitura.nextInt();
			leitura.nextLine();
			
			if (i == 0) {
				anoNascimentoDoMaisVelho = anoNascimento;
				nomeDoMaisVelho = nome;
			} else if (anoNascimento < anoNascimentoDoMaisVelho) {
				anoNascimentoDoMaisVelho = anoNascimento;
				nomeDoMaisVelho = nome;
			}
		}
		
		System.out.println("A pessoa mais velha é: " + nomeDoMaisVelho);
		System.out.println("A sua idade é: " + (2021 - anoNascimentoDoMaisVelho));
		
		leitura.close();
	}
	
}
