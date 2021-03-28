package fundamentos.operadores.condicionais.repeticao.arrays;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
	
//Desenvolva um programa que efetue a leitura de 10 valores para um vetor A e que esses valores sejam passados para a vetor B 
//verificando se o índice for par deverá ser multiplicado por 5 e se for impar, somado a 5

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [10];
		
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA [i] = sc.nextInt();
			vetorB [i] = vetorA [i];
			
		}
		
	}
}
