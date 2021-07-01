package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int contador = 0;
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Por favor, digite seu peso:");
			float peso = leitura.nextFloat();
			
			System.out.println("Por favor, digite sua altura:");
			float altura = leitura.nextFloat();
			
			float imc = peso / (altura * altura);
			if (imc >= 18.5f && imc <= 24.9f) {
				contador++;
			}
		}
		
		System.out.println("A porcentagem de pessoas que estão dentro da faixa "
				+ "normal do IMC é de " + contador + "%");
		
		leitura.close();
	}
	
}
