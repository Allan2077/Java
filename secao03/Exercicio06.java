package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//Variaveis
		float valor_por_horas, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Qual o valor você ganha por hora? ");
		valor_por_horas = teclado.nextFloat();
		
		System.out.println("Quantas horas você trabalhou neste mes? ");
		horas_trabalhadas = teclado.nextInt();
		
		//Processamento
		
		salario = (horas_trabalhadas * valor_por_horas);
		
		//Saida
		
		System.out.println("Neste mes você vai receber: " + salario);
		
		teclado.close();
		
		
		
	}

}
