package repeticao1;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {

//Faça um algoritmo que escreva na tela os números de um número inicial a um número final. 
//E mostre a quantidade de números pares e quantidade de números ímpares.

		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 2 números inteiros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		while (num1 < num2) {
			System.out.println(num1);
			num1++;
			
			if (num1 % 2 == 0) {
				System.out.print("Números pares: " );
			} else {
				System.out.print("Números ímpares: ");
			}
			
			}


	}
}
