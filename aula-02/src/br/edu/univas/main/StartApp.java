package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		int preco;
		preco = 10;
		int quantidade = 5;
		
		int total = preco + quantidade;
		System.out.println(total);
		
		total = preco - quantidade;
		System.out.println(total);
		
		total = preco * quantidade;
		System.out.println(total);
		
		total = preco / quantidade;
		System.out.println(total);
		
		//10 / 2 = 5 não sobra nada! significa que é zero (0)
		//7 / 2 = 3 e sobra alguma coisa! sobra um (1)
		int resultado = preco % 2;
		System.out.println(resultado);
		
		resultado = quantidade % 2;
		System.out.println(resultado);
		
		quantidade = quantidade + 10;
		System.out.println(quantidade);
		
		quantidade = quantidade + 20;
		System.out.println(quantidade);
		
		
		int idade = 10;
		System.out.println(idade);
		
		idade = 11;
		System.out.println(idade);
		
		idade = 10 + 5;
		System.out.println(idade);
		
		idade = idade + 20;
		System.out.println(idade);
		
		idade += 20; //idade = idade + 20;
		System.out.println(idade);
		
		idade -= 5; //idade = idade - 5;
		System.out.println(idade);
		
		idade *= 5; //idade = idade * 5;
		System.out.println(idade);
		
		idade /= 5; //idade = idade / 5;
		System.out.println(idade);
		
		idade %= 2; //idade = idade % 2;
		System.out.println(idade);
		
		//% é a mesma coisa que / ? (Divisão)
		//resposta = não!
		int a = 20 / 4;
		System.out.println(a);
		
		a = 20 % 3;
		System.out.println(a);
		//20 / 3 = 6 (sobra 2)
		
		double b = 20.0 / 3.0;
		System.out.println(b);
		
		float c = 20.0f / 3.0f;
		System.out.println(c);
		
		double xx = 1.0;
		float yy = 1.0f;
		
		int contador = 35;
		contador = contador + 1;
		System.out.println(contador);
		contador += 1;
		System.out.println(contador);
		contador++; //incrementa o valor da variavel em 1
		System.out.println(contador);
		contador--; //decrementa o valor da variavel em 1
		System.out.println(contador);
		++contador;
		System.out.println(contador);
		--contador;
		System.out.println(contador);
		
		System.out.println("VALOR NOVO:");
		contador = 10;
		System.out.println(contador++); //imprime primeiro e incrementa depois
		System.out.println(contador);
		System.out.println(++contador); //incrementa primeiro e imprime depois
	}
	
}
