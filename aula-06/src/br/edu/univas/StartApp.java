package br.edu.univas;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o nome da sua faculdade:");
		String universidade = leitura.nextLine();
		
		System.out.println("Digite seu nome:");
		String nome = leitura.nextLine();
				
		System.out.println("Qual é a sua idade:");
		int idade = leitura.nextInt();
		leitura.nextLine();
		
		System.out.println("Qual cidade você mora?");
		String cidade = leitura.nextLine();
		
		System.out.println("Bem vindo " + nome + " da faculdade " + universidade + 
				" com a idade " + idade + " e da cidade " + cidade);
		
		leitura.close();
	}
}
