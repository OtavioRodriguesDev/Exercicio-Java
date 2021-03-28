package repeticao2;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int x = rnd.nextInt(100);
		int palpite = 0;

		System.out.println(x);

		while (palpite != x) {
			System.out.print("Digite um número: ");
			palpite = sc.nextInt();
			
			if (palpite > x) {
				System.out.println("Maior");
			} else if (palpite < x) {
				System.out.println("Menor");
			}
			
			System.out.println(palpite + " Congrats ! You got the right number !");
		}

			
	}
}
