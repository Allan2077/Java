package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class laçoswitch {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
				
				System.out.println("Informe um dia da semana (1-7");
		        int diaSemana = teclado.nextInt();
		        
				if (diaSemana == 1) {
					System.out.println("Domingo");
				}else if(diaSemana == 2) {
					System.out.println("Segunda");
				}else if(diaSemana == 3) {
					System.out.println("Terça feira");
				}else if(diaSemana == 4) {
					System.out.println("Quarta feira");
				}else if(diaSemana == 5) {
					System.out.println("Quinta feira");
				}else if (diaSemana == 6) {
					System.out.println("Sexta feira");
				}else if(diaSemana == 7) {
					System.out.println("Sabado");
				}else {
					System.out.println("Não é um dia da semana válido ");
				}
				switch(diaSemana) {
				case 2: System.out.println("Segunda feira");break;
				case 3: System.out.println("Terça feira");break;
				case 4: System.out.println("Quarta fedira");break;
				case 5: System.out.println("Quinta feira");break;
				case 6: System.out.println("Sexta feira");break;
				case 7: System.out.println("Sabado");break;
				default: System.out.println("Não é um dia da semana valido ");
				}
	}

}
