package br.edu.univas;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int contadorPassouDireto = 0;
		int contadorRecuperacao = 0;
		int contadorDependencia = 0;
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Por favor, digite sua nota:");
			float nota = leitura.nextFloat();
			
			if (nota >= 60) {
				contadorPassouDireto++;
			} else if (nota >= 30) {
				contadorRecuperacao++;
			} else {
				contadorDependencia++;
			}
		}
		
		int porcentagemPassouDireto = contadorPassouDireto * 2;
		int porcentagemRecuperacao = contadorRecuperacao * 2;
		int porcentagemDependencia = contadorDependencia * 2;
		
		System.out.println(porcentagemPassouDireto + "% de pessoas passaram direto. Um total de " + contadorPassouDireto + " pessoas");
		System.out.println(porcentagemRecuperacao + "% de pessoas de recuperação. Um total de " + contadorRecuperacao + " pessoas");
		System.out.println(porcentagemDependencia + "% de pessoas de dependência. Um total de " + contadorDependencia + " pessoas");
		
		leitura.close();
	}
	
}
