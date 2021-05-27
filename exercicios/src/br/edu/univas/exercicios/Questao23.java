package br.edu.univas.exercicios;

public class Questao23 {

	public static void main(String[] args) {
		//FOR
		String valor = "";
		for (int i = 0; i < 10; i++) {
			valor += "*";
			System.out.println(valor);
		}
		
		//outra proposta
		//for para linhas
		for (int i = 0; i < 10; i++) {
			
			//for para colunas
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//WHILE
		int i = 0;
		valor = "";
		
		while (i < 10) {
			valor += "*";
			System.out.println(valor);
			i++;
		}
	}
}
