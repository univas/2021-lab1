package br.edu.univas;

public class Questao1 {

	public static void main(String[] args) {
		int nota1 = 69;
		int nota2 = 99;
		int nota3 = 12;
		int nota4 = 70;
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 70) {
			System.out.println("Aluno aprovado");
		} else if (media >= 50 && media <= 69) {
			System.out.println("Aluno em recuperação");
		} else {
			System.out.println("Aluno em dependência");
		}
	}
}
