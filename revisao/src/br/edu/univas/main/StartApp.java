package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {
	
	public static void main(String[] args) {
		int a = 0;
		long b = 0;
		short c = 0;
		byte d = 0;
		float e = 0.0f;
		double f = 0.0;
		char g = 'R';
		boolean h = true;
		
		String nome = "Rodrigo";
		String sobreNome = "Faria";
		
		String nomeCompleto = nome + " " + sobreNome;
		System.out.println(nomeCompleto);
		
		int idade = 50;
		
		if (idade < 60) {
			System.out.println("Ainda não pode se aposentar !!!");
		}
		
		if (idade < 60) {
			System.out.println("Ainda não pode se aposentar !!!");
		} else if (idade == 60) {
			System.out.println("Esse é o ano para se aposentar !!!");
		} else {
			System.out.println("Já passou do ano da sua aposentadoria !!!");
		}
		
		if (idade > 10 && idade < 30) {
			System.out.println("bla bla bla");
		}
		
		if (idade == 20 || idade == 30) {
			System.out.println("bla bla bla");
		}
		
		if (idade == 10) {
			System.out.println("bla");
		} else if (idade == 15) {
			System.out.println("bla bla");
		} else if (idade == 20) {
			System.out.println("bla bla bla");
		}
		
		switch (idade) {
		case 10:
			System.out.println("bla");
			break;
		case 20:
			System.out.println("bla bla");
			break;
		case 30:
			System.out.println("bla bla bla");
			break;
		default:
			System.out.println("bla bla bla default");	
		}
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o nome da faculdade:");
		String nomeFaculdade = leitura.nextLine();
		System.out.println(nomeFaculdade);
		
		System.out.println("Digite o seu peso:");
		float peso = leitura.nextFloat();
		System.out.println("O peso digitado foi de: " + peso);
		
		idade = 2;
		while (idade < 18) {
			System.out.println("você ainda mora com seus pais");
			idade++;
		}
		
		idade = 2;
		do {
			System.out.println("você ainda mora com seus pais");
			idade++;
		} while(idade < 18);
		
		for (idade = 2; idade < 18; idade++) {
			if (idade == 15) {
				break;
			}
			
			if (idade == 11) {
				continue;
			}
			
			System.out.println("você ainda mora com seus pais");
		}
		
		int[] idades = new int[10];
		idades[0] = 10;
		idades[9] = 90;

		System.out.println("Primeira idade: " + idades[0]);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número:");
			idades[i] = leitura.nextInt();
		}
		
		int a1 = 100;
		int a2 = a1 % 2; //100 / 2 = 50 (resto é 0)
		
		a1 = a1 + a2;
		a1 += a2;
		
		a1 %= 2;
		System.out.println(a1);
		
		leitura.close();
	}
}
