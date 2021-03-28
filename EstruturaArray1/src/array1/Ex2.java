package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
//Ler duas vetor A e B com 20 elementos. Construir um vetor C, sendo este formado pelos elementos de A subtraídos dos elementos de B.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite 20 valores: ");
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		int[] vetorC = new int[20];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			
		}
		
		System.out.println("Subtração = ");
		System.out.println(Arrays.toString(vetorC));
	
	}
}
