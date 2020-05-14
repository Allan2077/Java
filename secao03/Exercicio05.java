package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Variaveis
		
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		
		System.out.println("Informe o valor em metros ");
		metros = teclado.nextInt();
		
		//Processamento
		
		centimetros = (metros * 100);
		
		//Saida
		
		System.out.println(  "metros em centimetros é " + centimetros);
		
		teclado.close();
		

	}

}
