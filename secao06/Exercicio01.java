package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Variaveis
		int n;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe um numero: ");
		n = teclado.nextInt();
		
		//Processamento
		
		if(n > 100) {
			System.out.println(n);
		}else {
			n= 0;
			System.out.println(n);
		}
		teclado.close();
		
		
		
	
	}

}
