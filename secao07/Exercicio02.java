package br.com.geekuniversity.secao07;

public class Exercicio02 {

	public static void main(String[] args) {
		// faça um algoritimo que conte de 1 a 100 e a cada multiplo de 10 emita uma mensagem : "Multiplo de 10"
		
		int i;
		
		for (i = 1; i <= 100;i++) {
			System.out.println(i);
		if ( i % 10 == 0) {
			System.out.println("Multiplo de 10 : " + i);
		
		}
	}

}
}
