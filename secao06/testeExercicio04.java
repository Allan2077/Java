package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class testeExercicio04 {

	public static void main(String[] args) {
		//Variaveis
		
		float altura, peso_ideal = 0;
		char sexo;
	    Scanner teclado = new Scanner (System.in);
	    
	    //Entradas
	    System.out.println("Informe a altura: ");
	    altura = teclado.nextFloat();
	    
	    System.out.println("Informe o sexo m/f : ");
	    sexo = teclado.next().charAt(0);
	    
	    //Processamento
	    if(sexo =='m') {
	    	peso_ideal = (float)(72.7 * altura) -(float)58;
	    }
	    if (sexo =='f') {
	    	peso_ideal = (float)(62.1 * altura) -(float)44.7;
	    }
	    if (sexo!= 'm' && sexo!= 'f') {
	    	System.out.println("Sexo não reconhecido");
	    	peso_ideal = 0;
	    }
	    
	    System.out.printf("O peso ideal é %.2f",peso_ideal);
	    teclado.close();
	}
	

}
