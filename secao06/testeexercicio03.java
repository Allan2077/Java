package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class testeexercicio03 {

	public static void main(String[] args) {
		//Variaveis
		int numero, p = 0, i = 0;
		
		Scanner teclado = new Scanner (System.in);
		//Entrada
		
		System.out.println("Informe o número: ");
		numero = teclado.nextInt();
		
		//Processamento
		if (numero % 2 == 0) {
			p = numero;
			System.out.println("número par ");
		}else {
			i = numero;
			System.out.println("número ímpar ");
			teclado.close();
		}
	}

}
