package repeticao1;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {

//Fa�a um algoritmo que escreva na tela os n�meros de um n�mero inicial a um n�mero final. 
//E mostre a quantidade de n�meros pares e quantidade de n�meros �mpares.

		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 2 n�meros inteiros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		while (num1 < num2) {
			System.out.println(num1);
			num1++;
			
			if (num1 % 2 == 0) {
				System.out.print("N�meros pares: " );
			} else {
				System.out.print("N�meros �mpares: ");
			}
			
			}


	}
}
