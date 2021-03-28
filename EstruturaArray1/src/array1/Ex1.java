package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

//Desenvolva um programa que efetue a leitura de 10 elementos para u vetor A e 
//apresente no final a somatória dos elementos ímpares.

		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[10];

		int i = 0;
		int soma = 0;

		while (i <= 10) {
			System.out.print("Digite um número: ");
			
			int num = sc.nextInt();
			i++;
			
			if (num % 2 == 1) {
				soma += num;

			}
		}
		
			System.out.println("Números ímpares = " + soma);
	}
}
