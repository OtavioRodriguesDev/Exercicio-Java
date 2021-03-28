package fundamentos.operadores.condicionais.repeticao.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
//Desenvolva um programa que efetue a leitura de 10 valores para um vetor A e que esses valores sejam passados para a vetor B.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [10];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA [i] = sc.nextInt();
			vetorB [i] = vetorA [i] + 10;	
			
		}
		System.out.println(Arrays.toString(vetorA));
		System.out.println(Arrays.toString(vetorB));
	}
	
}
