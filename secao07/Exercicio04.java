package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Variaveis
		
		int maior = -999, valor, menor = 999, soma = 0;
		float media;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um valor ");
			valor = teclado.nextInt(); 
			if(valor > 0) {
			if(valor > maior) {
				maior = valor;
			}
			if (valor < menor) {
				menor = valor;
			}
			soma = soma + valor;
		}else {
			i--;
		}
	}
	media = soma / 10;
	System.out.println("O maior numero é " + maior);
	System.out.println("O menor número é " + menor);
	System.out.println("A média dos números é " + media);
	teclado.close();
}
}
