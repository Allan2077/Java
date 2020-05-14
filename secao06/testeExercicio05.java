package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class testeExercicio05 {

	public static void main(String[] args) {
		//Variaveis
		float m, p;
		String e;
		Scanner teclado = new Scanner (System.in);
		
		//Entradas
		System.out.println("Informe o peso: ");
		p = teclado.nextFloat();
		
		//Pocessamento
		if (p > 50) {
		m = (float)(p - 50) *(float) 4.00 ;
		System.out.printf("O valor a ser pago é R$ %.2f ", m);  
        }else {
        	m = 0;
        	e = "0";
        	System.out.println("execesso " + e);
        	System.out.println("multa " + m);
        	teclado.close();
        }
	}
}


