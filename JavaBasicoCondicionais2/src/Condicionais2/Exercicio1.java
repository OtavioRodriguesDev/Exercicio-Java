package Condicionais2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

//Fa�a um Programa que leia tr�s n�meros e mostre o maior deles;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 n�meros inteiros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " � o maior n�mero ! ");
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " � o maior n�mero ! ");
		} else if (num3 > num1 && num3 > num2)
			System.out.println(num3 + " � o maior n�mero ! ");
		sc.close();

	}
}
