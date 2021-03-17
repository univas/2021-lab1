package br.edu.univas.main;

public class StartApp {
	/*
	  comentario de 
	  bloco
	 */
	public static void main(String[] args) {
		System.out.println("Hello world!!!");
		//variaveis primitivas!!!
		int age = 15;
		long a = 10;
		short b = 11;
		byte c = 12;
		double d = 25.6;
		float e = 99.9f;
		char f = 'R';
		boolean g = true;
		boolean isRainning = false;
		 
		System.out.println(age);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		f = 'X';
		System.out.println(a + "-" + b + "-" + c + 
				"-" + d + "-" + e + "-" + f + "-" + g);
		
		f = 'Y';
		f = 'A';
		String nomeAluno = "João 1234";
		System.out.println(nomeAluno);
		
		//criar 2 variaveis:
		//1 com primeiro nome
		//outra com seu sobrenome
		//imprimir seu nome completo em uma instrução só
		String nome = "Rodrigo";
		String sobreNome = "Faria";
		//concatenação
		System.out.println(nome + " " + sobreNome);
		System.out.println("Rodrigo Faria");
	}
}
