package br.edu.univas;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		String[] candidatos = new String[5];

		candidatos[0] = "Franklin";
		candidatos[1] = "Joana";
		candidatos[2] = "Cintia";
		candidatos[3] = "Vitor";
		candidatos[4] = "André";

		String candidato = candidatos[1];
		System.out.println("Candidato 2: " + candidato);

		candidato = candidatos[3];
		System.out.println("Candidato 4: " + candidato);

		String[] nomes = new String[50];
		String nomes2[] = new String[50];
		String[] nomes3 = {"Rodrigo", "Luis", "de", "Faria"};
		System.out.println(nomes3[3]);

		for (int i = 0; i < 50; i++) {
			// dentro do for
			System.out.println("Por favor, digite o seu nome:");
			nomes[i] = leitura.nextLine();
		}

		// fora do for
		System.out.println("Nomes digitados:");
		for (int i = 0; i < 50; i++) {
			System.out.println("Nome: " + nomes[i]);
		}
		
		//array
		int[] idade = new int[3];
		idade[0] = 10;
		idade[1] = 15;
		idade[2] = 25;

		leitura.close();
	}
}
