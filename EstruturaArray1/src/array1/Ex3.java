package array1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira 4 elementos do VetorA e 4 do VetorB: ");

		int[] vetorA = new int[4];
		int[] vetorB = new int[4];
		int[] vetorC = new int[8];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			vetorC[i] = vetorA[i];
		}

		int j = 0;
		for (int i = 4; i < vetorC.length; i++) {
			vetorB[j] = sc.nextInt();
			vetorC[i] = vetorB[j];
			j++;
		}

		for (int result : vetorC) {
			System.out.println(result);
		}
	}
}
