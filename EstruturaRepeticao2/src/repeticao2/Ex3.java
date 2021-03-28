package repeticao2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

//Faça um programa que leia 5 números e informe a soma e a média dos números.

		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int soma = 0;
		double numeros = 0;

		while (i < 5) {
			System.out.println("Digite um número: ");
			numeros = sc.nextDouble();
			soma += numeros;
			double media = numeros / 5;
			System.out.println("Soma dos números = " + soma);
			System.out.println("Média = "  + media);
			i++;
		}
		
	}

}
