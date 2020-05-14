package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//Variaveis
		
				int num;
				Scanner teclado = new Scanner(System.in);
				
				//Entrada
				
				System.out.println("Informe o numero: ");
				num = teclado.nextInt();
				
				//Processamento
				
				if (num % 2 == 0) {
					if(num > 0) {
						System.out.printf("O numero %d é par e positivo.\n", num);
					}else {
						System.out.printf("O numero %d é par e negativo.\n", num);
					}
					}else{
						if(num > 0){
							System.out.printf("O numero %d é ímpar e positivo.\n", num);
					
						}else {
							System.out.printf("O numero %d é ímpar e negativo.\n", num);
						}
					}
					teclado.close();
				}
		
	}


