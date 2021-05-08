package br.edu.univas.exercicios;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Calculo do peso ideal!");
		System.out.println("Informe o sexo.");
		System.out.println("0 - mulher");
		System.out.println("1 - homem");
		
		int sexo = leitura.nextInt();
		
		System.out.println("Digite a altura:");
		float altura = leitura.nextFloat();
		
		float pesoIdeal = 0.0f;
		if (sexo == 0) {
			pesoIdeal = 62.1f * altura - 44.7f;
		} else {
			pesoIdeal = 72.7f * altura - 58;
		}
		
		System.out.println("O peso ideal para sua altura é: " + pesoIdeal);
		
		leitura.close();
	}
	
}
