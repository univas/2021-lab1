package br.edu.univas.main;

public class StartApp3 {
	
	public static void main(String[] args) {
		String mesAtual = "Março";
		
		switch (mesAtual) {
			case "Janeiro":
			case "Março":
			case "Maio":
			case "Julho":
			case "Agosto":
			case "Outubro":
			case "Dezembro":
				System.out.println("Tem 31 dias");
				break;
			case "Fevereiro":
				System.out.println("Tem 28 dias");
				break;
			case "Abril":
			case "Junho":
			case "Setembro":
			case "Novembro":
				System.out.println("Tem 30 dias");
				break;
			default:
				System.out.println("Mês incorreto!");
		}
	}
	
}
