package Condicionais2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

//Fa�a um programa que leia 3 n�meros e mostre o maior e o menor deles;

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 3 n�meros");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " � o maior n�mero ! ");
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " � o maior n�mero ! ");
		}
		if (num3 > num1 && num3 > num2)
			System.out.println(num3 + " � o maior n�mero ! ");
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + "� o menor n�mero !");
		}
		if (num2 < num1 && num2 < num3) {
			System.out.println(num2 + " � o menor n�mero !");
		}
		if (num3 < num1 && num3 < num2) {
			System.out.println(num3 + " � o menor n�mero !");
		}

		sc.close();

	}
}
