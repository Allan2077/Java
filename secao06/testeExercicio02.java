package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class testeExercicio02 {

	public static void main(String[] args) {
		//Variaveis
		int num, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o número: ");
		num = teclado.nextInt();
		
		//Processamento
		if (num > 0) {
			a = num;
			System.out.println("O valor informado é A positivo ");
			
		}else {
			b = num;
			System.out.println("O valor informado é B negativo ");
		}
		teclado.close();
	}

}
