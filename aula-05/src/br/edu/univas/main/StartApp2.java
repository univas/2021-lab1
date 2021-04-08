package br.edu.univas.main;

public class StartApp2 {

	public static void main(String[] args) {
		int salario = 1000;
		//System.out.println(slario);

//		if (salario == 1000) {
//			System.out.println("Você tem que pagar 100 reais de imposto");
//		} else if (salario == 2000) {
//			System.out.println("Você tem que pagar 210 reais de imposto");
//		} else if (salario == 3000) {
//			System.out.println("Você tem que pagar 320 reais de imposto");
//		} else if (salario == 4000) {
//			System.out.println("Você tem que pagar 450 reais de imposto");
//		} else {
//			System.out.println("Você tem que pagar 575 reais de imposto");
//		}
		
		//String/char/byte/short/int -> tipos de variaveis que podemos utilizar no switch
		switch (salario) {
			case 1000:
				System.out.println("Você tem que pagar 100 reais de imposto");				
				break;
			case 2000:
				System.out.println("Você tem que pagar 210 reais de imposto");
				break;
			case 3000:
				System.out.println("Você tem que pagar 320 reais de imposto");
				break;
			case 4000:
				System.out.println("Você tem que pagar 450 reais de imposto");
				break;
			default:
				System.out.println("Você tem que pagar 575 reais de imposto");
				break;
		}
	}
	
}
