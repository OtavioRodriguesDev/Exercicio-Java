package Condicionais1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

//Faça um programa que peça um valor e
//mostre na tela se o valor é positivo ou negativo;		
		
		Scanner in = new Scanner(System.in);

		System.out.println("Informe um valor ");
		float valor = in.nextFloat();

		if (valor < 0) {
			System.out.println("Este valor é negativo");
		}

		else {
			System.out.println("Este valor é positivo");
		}

		in.close();

	}
}
