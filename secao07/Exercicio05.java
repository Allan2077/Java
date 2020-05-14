package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Variaveis
		
		String nome, senha;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada
		System.out.println(" Informe o nome: ");
		nome = teclado.next();
		
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		//Processamento
		while (nome.equals(senha)) {
			System.out.println("Erro: O nome de usuarios e senhas devem ser diferentes.");
			//Entrada
			System.out.println("Informe o nome: ");
			nome = teclado.next();
			
			System.out.println("Informe a senha: ");
			senha = teclado.next();
		}
		teclado.close();
	}

}
