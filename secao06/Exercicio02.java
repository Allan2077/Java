package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Variaveis
		
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		
		System.out.println("Informe o numero: ");
		numero = teclado.nextInt();
		
		//Processamento
		
		if (numero > 0) {
			a = numero;
		}
		else {
			b = numero;
		}
		
		//Saida
		
		System.out.println(numero);
		
		teclado.close();

	}

}
