package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Variaveis
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe a quantidade minima: ");
		quantidade_minima = teclado.nextInt();
		
		System.out.println("Informe a quantidade maxima: ");//CTRL + Barra de espaço
		quantidade_maxima = teclado.nextInt();
		
		//Processamento
		estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
		
		//Saida
		System.out.println("O estoque médio é " + estoque_medio);
		
		teclado.close();
		
		
		

	}

}
