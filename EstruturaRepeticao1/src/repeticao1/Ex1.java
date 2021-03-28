package repeticao1;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

//Escreva um algoritmo que leia 20 valores inteiros e ao final exiba: 
//a soma dos números positivos; 
//a quantidade de valores negativos

		int i = 0;
		int soma = 0;
		int QuantiNegativos = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");

		while (i < 20) {
			int numeros = sc.nextInt();
			i++;

			if (numeros >= 0) {
				soma += numeros;

			}

			else if (numeros < 0) {
				QuantiNegativos++;

			}

			System.out.println("A soma dos números positivos = " + soma);
			System.out.println("A quantidade dos números negativos = " + QuantiNegativos);
		}
	}
}