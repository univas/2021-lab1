package br.edu.univas.exercicios;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o nome:");
		String nome = leitura.nextLine();
		
		System.out.println("Digite a quantidade de horas trabalhadas:");
		float horasTrabalhadas = leitura.nextFloat();
		
		System.out.println("Digite o valor/hora:");
		float valorHora = leitura.nextFloat();
		
		float valorAReceber = valorHora * horasTrabalhadas;
		System.out.println("Sr(a) " + nome + " irá receber R$ " + valorAReceber);
		
		leitura.close();
	}
}
