package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Teste2uri {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
        int a;
        int b;
        int soma;
        
        a = teclado.nextInt();
        b = teclado.nextInt();
        soma = a + b;
        System.out.println("X = " + soma);
        teclado.close();
		}
		
	}


