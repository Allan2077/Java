package br.com.geekuniversity.secao07;

public class Exercicio03 {

	public static void main(String[] args) {
		//Elabore um programa que gera e escreve os números ímpares dos números entre 100 e 200.
		
		int i;
		
		for (i = 100; i <= 200; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
