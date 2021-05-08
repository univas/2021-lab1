package br.edu.univas;

import java.util.Scanner;

public class StartApp2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int contador = 1;
		
		System.out.println("EXEMPLO 1");
		do {
			System.out.println(contador + "º aluno");
			System.out.println("Digite a 1ª nota:");
			int nota1 = leitura.nextInt();
			leitura.nextLine();
			
			System.out.println("Digite a 2ª nota:");
			int nota2 = leitura.nextInt();
			leitura.nextLine();
			
			int media = (nota1 + nota2) / 2;
			System.out.println("A média das notas é: " + media);
			
			contador++;
		} while (contador <= 5);
		
		
		System.out.println("EXEMPLO 2");
		do {
			
			int nota = leitura.nextInt();
			leitura.nextLine();
			if (nota < 0) {
				break;
			}
			
			//segue com código aqui
		} while (true);
		
		System.out.println("EXEMPLO 3");
		int contador2 = 0;
		do {
			System.out.println("Novo aluno:");
			System.out.println("Digite o nome do aluno:");
			String nome = leitura.nextLine();
			
			int contadorDeNotas = 0;
			int nota = 0;
			
			do {
				System.out.println("Digite uma nota:");
				
				int notaAtual = leitura.nextInt();
				leitura.nextLine();
				if (notaAtual < 0) {
					break;
				}
				nota += notaAtual;
				contadorDeNotas++;
				
			} while (true);
			
			int media = nota / contadorDeNotas;
			System.out.println("A média do " + nome + " foi de: " + media);
			contador2++;
		} while (contador2 < 10);

		leitura.close();
	}
}
