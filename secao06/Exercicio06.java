package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//Variaveis
		
		int c;
		float e = 0, n,salario, valor_hora = (float) 10.00;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		
		System.out.println("Informe o codigo: " );
		c = teclado.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		//Processamento 
		
		if(n > 50) {
			e = (float)(n - 50)* (float) 20.00;
			salario = (50 * valor_hora) + e;
			System.out.printf("Salario total R$ %.2f\n", salario);
			System.out.printf("Salario excedente R$ %.2f\n", e);
		}else {
			salario = (n * valor_hora);
			 System.out.printf("Salario total R$ %.2f\n", salario);
			 System.out.printf("Salario excedente R$ %.2f, ", e);
			 
		}
		teclado.close();
	
	}

}
