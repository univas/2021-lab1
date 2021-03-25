package br.edu.univas.exercicios;

public class Questao1 {

	public static void main(String[] args) {
		double salario = 10000.00;
		
		if (salario >= 4664.68) {
			System.out.println("Você se enquadrou na faixa de: 27,5% do IR");
		
		} else if (salario >= 3751.06) {
			System.out.println("Você se enquadrou na faixa de: 22,5% do IR");
		
		} else if (salario >= 2826.67) {
			System.out.println("Você se enquadrou na faixa de: 15,0% do IR");
		
		} else if (salario >= 1903.99) {
			System.out.println("Você se enquadrou na faixa de: 7,5% do IR");
		
		} else {
			System.out.println("Você está isento do IR!!!");
		}
	}
	
}
