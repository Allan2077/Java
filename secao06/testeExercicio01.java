package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class testeExercicio01 {

	public static void main(String[] args) {
		//Variaveis
		
		int num;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		
		System.out.println("Informe o valor: ");
		num = teclado.nextInt();
		
		//Processamento
		
		if (num > 100) {
			System.out.println(num);
		}else {
			num = 0;
			System.out.println(num);
		}
		teclado.close();
	}

}
