package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class testeExercicio06 {

	public static void main(String[] args) {
		
		//Variaveis
		
		int horas_trabalhadas;
		float valor_por_hora, salario;
		
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		
		System.out.println("Informe o valor por horas:  ");
		valor_por_hora = teclado.nextFloat();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		horas_trabalhadas = teclado.nextInt();
		
		//Processamento
		
		salario = (valor_por_hora * horas_trabalhadas);
		
		//Saida
		
		System.out.printf("O salario é de: " + salario);
		
		teclado.close();
		
		

	}

}
