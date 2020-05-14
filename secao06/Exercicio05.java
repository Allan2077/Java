package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Variaveis
		
		float multa, peso;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		
		System.out.println("Informe o peso dos peixes: ");
		peso = teclado.nextFloat();
		
		//Processamento
		
		if (peso > 50) {
			multa = (float) (peso - 50)* (float)  4.00;
			//Saida
			System.out.printf("Você devera pagar %.2f em multas", multa);
			}else {
				multa = 0;
				e = "0";
				//Saida
				System.out.println("Multas: " + multa);
				System.out.println("Excesso " + e);
				teclado.close();
			}

	}

}
