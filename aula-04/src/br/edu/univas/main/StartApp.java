package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		float saldo = 1310.78f;
		float precoCelularA = 1200f;
		float precoCelularB = 1500f;
		
		if (saldo >= precoCelularA || saldo >= precoCelularB) {
			System.out.println("Você pode comprar um celular!");
		} else {
			System.out.println("Saldo insuficiente para realizar a compra!");
		}
		
		int idade = 20;
		
		if (idade == 18 || idade == 19 || idade == 20 || idade == 21) {
			System.out.println("Pode ser contratado");
		} else {
			System.out.println("Não pode ser contratado!");
		}
		
		if (idade >= 18 && idade <= 21) {
			System.out.println("Pode ser contratado");
		} else {
			System.out.println("Não pode ser contratado!");
		}
	}
}
