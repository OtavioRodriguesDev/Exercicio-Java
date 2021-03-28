package Condicionais1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

//Faça um algoritmo que receba um número e mostre uma mensagem
//Caso este número seja maior que 10;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Informe um número");
		int num = in.nextInt();

		if (num > 10) {
			System.out.println("Este número é maior que 10");
		}

		else {
			System.out.println("O número informado é: " + num);
		}

		in.close();

	}
}
