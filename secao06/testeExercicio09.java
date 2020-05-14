package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class testeExercicio09 {

	public static void main(String[] args) {
		// Variaveis
		float indice;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println("Informe o indice de poluição: ");
		indice = teclado.nextFloat();
		
		//Processamento
		
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Atenção industria do primeiro grupo suspender atividades ");
		}else {
			if (indice >= 0.4 && indice < 0.5) {
				System.out.println("Atenção industria do 1º e 2º grupo suspender as atividades");
			}else {
				if (indice >= 0.5 ) {
					System.out.println("Todos os grupos suspendam as atividades");
				}else {
					if (indice >= 0.1 && indice < 0.3) {
						System.out.println("A industria pode seguir com as atividades");
					}
				}
				teclado.close();
			}
		}

	}

}
