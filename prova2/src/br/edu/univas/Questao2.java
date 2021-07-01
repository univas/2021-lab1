package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		float saldo = 0.0f;
		
		do {
			System.out.println("Por favor, digite o tipo da conta:");
			System.out.println("1 - Receita");
			System.out.println("2 - Despesa");
			int tipoConta = leitura.nextInt();
			
			if (tipoConta == 0) {
				break;
			} else if (tipoConta != 1 && tipoConta != 2) {
				System.out.println("Tipo da conta inválido!");
				continue;
			}
			
			System.out.println("Por favor, digite o valor da conta:");
			float valorConta = leitura.nextFloat();
			
			if (tipoConta == 1) {
				saldo += valorConta;
			} else if (tipoConta == 2) {
				saldo -= valorConta;
			}
			
		} while(true);
		
		if (saldo > 0.0f) {
			System.out.println("Você fechou o mês positivo! Seu saldo é: R$ " + saldo);
		} else if (saldo < 0.0f) {
			System.out.println("Você fechou o mês negativo! Seu saldo é: R$ " + saldo);
		} else {
			System.out.println("Você fechou o mês no zero a zero! Seu saldo é: R$ " + saldo);
		}
		
		leitura.close();
	}
	
}
