package br.edu.univas;

import java.util.Scanner;

public class StartApp3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Exemplo 1:::");
		//for (inicializacao; condicao; incremento/decremento) {
		for (int contador = 1; contador <= 5; contador++) {
			System.out.println(contador + "º aluno");
			
			if (contador == 3) {
				continue;
			}
			
			System.out.println("Digite a 1ª nota:");
			int nota1 = leitura.nextInt();
			
			System.out.println("Digite a 2ª nota:");
			int nota2 = leitura.nextInt();
			
			int media = (nota1 + nota2) / 2;
			System.out.println("A média das notas é: " + media);
		}
		
		System.out.println("Exemplo 2:::");
		int contador = 1;
		for (;;) {
			System.out.println("Teste");
			contador++;
			if (contador == 5) {
				break;
			}
		}
		
		System.out.println("Exemplo 3:::");
		for (; contador < 7; contador++) {
			System.out.println("Teste");
		}
		
		for (contador = 1; ; contador++) {
			if (contador == 3) {
				break;
			}
			System.out.println("Teste 44");			
		}
		
		for (contador = 1; contador < 5;) {
			if (contador == 3) {
				break;
			}
			System.out.println("Teste 44");
			contador++;
		}
		
		leitura.close();
	}
}
