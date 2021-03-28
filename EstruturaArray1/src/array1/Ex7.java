package array1;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;

		for (int i = 1; i >= 1; i++) {
			System.out.println("Digite um número inteiro: ");
			int num = sc.nextInt();

			if (num >= 1 && num <= 25) {
				soma = soma + 1;
				System.out.println("intervalo de [1 - 25] " + soma + " vez(es)");
			} else {
				if (num >= 26 && num <= 50) {
					soma1 = soma1 + 1;
					System.out.println("intervalo de [26 - 50] " + soma1 + " vez(es)");

				} else if (num >= 50 && num <= 75) {
					soma2 = soma2 + 1;
					System.out.println("intervalo de [51 - 75] " + soma2 + " vez(es)");
				}

				else if (num >= 76 && num <= 100) {
					soma3 = soma3 + 1;
					System.out.println("intervalo de [76 - 100] " + soma3 + " vez(es)");

				}
			}
		}
	}
}
