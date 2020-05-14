package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class testeExercicio04 {

	public static void main(String[] args) {
		//Variaveis
		
		int soma, num1, num2;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		
		System.out.printf("Informe o primero numero : ");
		num1 = teclado.nextInt();
		
		System.out.printf("Informe o segundo numero : ");
		num2 = teclado.nextInt();
		
		//Processamento
		
		soma = num1 + num2;
		
		//Saida
		
		System.out.println("O resultado da soma é  : " + soma);
		
		teclado.close();
		

	}

}
