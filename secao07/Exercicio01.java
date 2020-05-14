package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		////Variaveis
		
		int n, maior = 0;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println("Informe o numero: ");
		n = teclado.nextInt();
		
		//Processamento
		while( n != 0) {
			if (n > maior) {
				maior = n;
			}
				System.out.println("Infome o numero: ");
				n = teclado.nextInt();
			}
			System.out.printf("O maior numero é %d ", maior);
		    teclado.close();
	

}

	}


