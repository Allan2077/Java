package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class testeExercicio06 {

	public static void main(String[] args) {
		//Variaveis
		float n, e = 0, valor_por_horas =(float) 10.00, salario;
		int c;
	    Scanner teclado = new Scanner(System.in);
	    
	    //Entradas
	   System.out.println("Informe o codigo: ");
	   c = teclado.nextInt();
	   
	   System.out.println("Informe a quantidade de horas trabalhas: ");
	   n = teclado.nextFloat();
	   
	   //Processamento
	   
	   if (n > 50) {
		   e = (n - 50) *(float) 20.00;
		   salario = (50 * valor_por_horas) + (float) e;
		   System.out.printf("Salario total R$ %.2f\n ", salario);
		   System.out.printf("Salario excedente R$ %.2f\n ", e);
		   }else {
			   salario = n * valor_por_horas;
			   System.out.printf("Salario total R$ %.2f\n ", salario);
			   System.out.printf("Salario excedente R$ %.2f \n", e);
		   }
	   teclado.close();
	}
	

}
