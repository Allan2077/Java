package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class testeExercicio07 {

	public static void main(String[] args) {
		//Variaveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println("Informe a altura: ");
		altura = teclado.nextFloat();
		
		//Processamento
		peso_ideal = (altura *(float) 72.7) -58;
		
		//Saída
		System.out.println("O peso ideal é :" + peso_ideal);
		teclado.close();
		}
}
