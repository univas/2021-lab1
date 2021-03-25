package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		/*
		 * 5 + 6 > 9 = SIM = true 
		 * 5 + 10 < 2 = NAO = false 
		 * > sinal de MAIOR 
		 * < sinal de MENOR
		 */
		System.out.println("INICIO DO PROGRAMA DE VOTAÇÃO");
		int idadeAtual = 18;
		if (idadeAtual >= 18) {
			System.out.println("Você é obrigado a votar!");
		}

		if (idadeAtual < 18) {
			System.out.println("Você não pode votar!");
		}

		System.out.println("FIM DO PROGRAMA DE VOTAÇÃO");

		System.out.println("----------------------------");
		System.out.println("INICIO DO PROGRAMA DE HABILITAÇÃO");

		idadeAtual = 95;
		if (idadeAtual >= 18) {
			System.out.println("Você já pode tirar habilitação");
		} else {
			System.out.println("Você não pode tirar habilitação");
		}

		System.out.println("FIM DO PROGRAMA DE HABILITAÇÃO");
		
		System.out.println("----------------------------");
		System.out.println("INICIO DO PROGRAMA DE VOTAÇÃO 2.0");
		idadeAtual = 18;

		if (idadeAtual >= 18) {
			System.out.println("Você é obrigado a votar!");
			
		} else if (idadeAtual >= 16) {
			System.out.println("Você está habilitado a votar!");
			
		} else {
			System.out.println("Você não pode votar!");
		}
		
		System.out.println("FIM DO PROGRAMA DE VOTAÇÃO 2.0");
	}

}
