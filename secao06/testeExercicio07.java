package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class testeExercicio07 {

	public static void main(String[] args) {
		//Variaveis
		int n1, n2, n3, n4, q1,q2,q3,q4;
		Scanner teclado= new Scanner (System.in);
		
		//Entrada
		System.out.println("Informe o numero 1: ");
		n1 = teclado.nextInt();
		System.out.println("Informe o numero 2: ");
		n2 = teclado.nextInt();
		System.out.println("Informe o numero 3: ");
		n3 = teclado.nextInt();
		System.out.println("Informe o numero 4: ");
		n4 = teclado.nextInt();
		
		//Processamento
		q1 = n1 * n1;
		q2 = n2 * n2;
		q3 = n3 * n3;
		q4 = n4 * n4;
		
		if (q3 >= 1000) {
			System.out.printf("O valor informado é   " + q3);
		
			}else {
				System.out.printf("Numero 1: %d Quadrado: %d\n", n1, q1);
				System.out.printf("Numero 2: %d Quadrado: %d\n", n2, q2);
				System.out.printf("Numero 3: %d Quadrado: %d\n", n3, q3);
				System.out.printf("Numero 4: %d Quadrado: %d\n", n4, q4);
			}
		teclado.close();

}
}