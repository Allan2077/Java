package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		//Variaveis
		
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		
		System.out.println("Informe o indice de poluição:" );
		indice = teclado.nextFloat();
		
		//Processamento
		
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Atenção: industrias do 1º grupo devem suspender as atividades.");
		}else if(indice >= 0.4 && indice < 0.5){
			System.out.println("Atenção: Industria do 1º E 2º grupo devem suspender as atividades.");
		}else if(indice >= 0.5) {
			System.out.println("Atenção: todos os grupos devem suspender as atividades.");
			}
		teclado.close();
	}

}
