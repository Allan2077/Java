package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Meucalendario {

	public static void main(String[] args) {
		 
		//Variaveis
		   String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", 
					"Set", "Out", "Nov","Dez"};
			int total [] = {30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int bissexto [] = {30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			Scanner teclado = new Scanner (System.in);
			
			//Entrada
			System.out.println("Informe um ano: ");
			int ano = teclado.nextInt();
			
			//Processamento
			if((ano % 400 == 0) ||(ano % 4 == 0 && ano % 100 != 0)) {
			
				System.out.println("Ano Bissexto");
				for( int b = 0; b <mes.length;b++) {
					System.out.println(" o mes de " + mes [b] + " tem " + bissexto[b] + " dias do ano ");
					
				}
				return;
			}else {
				System.out.println("Ano não Bissexto\n");
			
			}
			
		    //Saída
			for( int n = 0; n <mes.length;n++) {
				
				System.out.println(" O mes de " + mes [n] + " tem " + total[n] + " dias do ano " );
			
			}
		}
	}
