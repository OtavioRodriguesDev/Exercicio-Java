package Condicionais2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

//Faça um programa que leia 3 números e mostre o maior e o menor deles;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 3 números");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o maior número ! ");
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é o maior número ! ");
		}
		if (num3 > num1 && num3 > num2)
			System.out.println(num3 + " é o maior número ! ");
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + "é o menor número !");
		}
		if (num2 < num1 && num2 < num3) {
			System.out.println(num2 + " é o menor número !");
		}
		if (num3 < num1 && num3 < num2) {
			System.out.println(num3 + " é o menor número !");
		}

		sc.close();

	}
}
