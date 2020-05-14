package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class testeExercicio08 {

	public static void main(String[] args) {
		//Variaveis
		
		int numero;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.println("Informe o numero: ");
		numero = teclado.nextInt();
		
		//Processamento
		if (numero % 2 == 0) {
			if (numero > 0) {
			System.out.printf("O numero %d é par e positivo\n", numero);
		}else {
			System.out.printf("O numero %d é par e negativo\n", numero);
			}
		}else {
			if (numero > 0){
				System.out.printf("O numero %d é impar e positivo\n", numero);
			}else {
				System.out.printf("O numero %d é impar e negativo\n", numero);
				teclado.close();
			}
			
		}

	}

}
