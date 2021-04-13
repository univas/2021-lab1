package br.edu.univas;

public class Questao2 {

	public static void main(String[] args) {
		int resposta1 = 1;
		int resposta2 = 2;
		int resposta3 = 1;
		
		int resposta1Regiao = 4;
		int resposta2Regiao = 1;
		int resposta3Regiao = 5;
		
		int contadorSim = 0;
		int contadorNao = 0;
		
		if (resposta1 == 1) {
			contadorSim++;
		} else {
			contadorNao++;
		}
		
		if (resposta2 == 1) {
			contadorSim++;
		} else {
			contadorNao++;
		}
		
		if (resposta3 == 1) {
			contadorSim++;
		} else {
			contadorNao++;
		}
		
		int contadorSul = 0;
		int contadorSudeste = 0;
		int contadorCentroOeste = 0;
		int contadorNorte = 0;
		int contadorNordeste = 0;
		
		if (resposta1Regiao == 1) {
			contadorSul++;
		} else if (resposta1Regiao == 2) {
			contadorSudeste++;
		} else if (resposta1Regiao == 3) {
			contadorCentroOeste++;
		} else if (resposta1Regiao == 4) {
			contadorNorte++;
		} else {
			contadorNordeste++;
		}
		
		if (resposta2Regiao == 1) {
			contadorSul++;
		} else if (resposta2Regiao == 2) {
			contadorSudeste++;
		} else if (resposta2Regiao == 3) {
			contadorCentroOeste++;
		} else if (resposta2Regiao == 4) {
			contadorNorte++;
		} else {
			contadorNordeste++;
		}
			
		if (resposta3Regiao == 1) {
			contadorSul++;
		} else if (resposta3Regiao == 2) {
			contadorSudeste++;
		} else if (resposta3Regiao == 3) {
			contadorCentroOeste++;
		} else if (resposta3Regiao == 4) {
			contadorNorte++;
		} else {
			contadorNordeste++;
		}
		
		System.out.println("Resultado:");
		System.out.println("Votos em SIM: " + contadorSim);
		System.out.println("Votos em NÃO: " + contadorNao);
		
		System.out.println("Votos por região:");
		System.out.println("Região Sul: " + contadorSul);
		System.out.println("Região Sudeste: " + contadorSudeste);
		System.out.println("Região Centro Oeste: " + contadorCentroOeste);
		System.out.println("Região Norte: " + contadorNorte);
		System.out.println("Região Nordeste: " + contadorNordeste);
	}
	
}
