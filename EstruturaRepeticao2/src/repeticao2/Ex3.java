package repeticao2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

//Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros.

		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int soma = 0;
		double numeros = 0;

		while (i < 5) {
			System.out.println("Digite um n�mero: ");
			numeros = sc.nextDouble();
			soma += numeros;
			double media = numeros / 5;
			System.out.println("Soma dos n�meros = " + soma);
			System.out.println("M�dia = "  + media);
			i++;
		}
		
	}

}
