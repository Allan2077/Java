package br.com.geekuniversity.secao06;


import java.util.Scanner;

public class Tets1002uri {

	public static void main(String[] args) {
		
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Informe o valor de Raio: ");
		double pi = 3.14159;
		double raio = scan.nextDouble();
		double area = pi * Math.pow(raio, 2); //"Math.pow(raio,2)" está calculando raio ao quadrado!
		
		System.out.printf("A =%.4f ", area);
		scan.close();
	}

}
