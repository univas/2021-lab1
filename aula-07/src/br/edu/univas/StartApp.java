package br.edu.univas;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int contador = 1;
		
		while (contador <= 5) {
			System.out.println(contador + "º aluno");
			
			System.out.println("Digite a 1ª nota:");
			int nota1 = leitura.nextInt();
			
			System.out.println("Digite a 2ª nota:");
			int nota2 = leitura.nextInt();
			
			int media = (nota1 + nota2) / 2;
			System.out.println("A média das notas é: " + media);
			
			contador++;
			if (contador == 4) {
				break;
			}
		}
				
		leitura.close();
	}
}
