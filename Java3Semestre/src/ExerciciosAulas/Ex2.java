package ExerciciosAulas;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 10 valores:");

		int vetor[] = new int[10];

		for (int i = 0; i <= 10; i++) {
			vetor[i] = sc.nextInt();
			if (vetor[i] < 1) {
				vetor[i] = 1;
			}

			System.out.println("X" + "[" + i + "]" + " = " + vetor[i]);
		}

	}
}
