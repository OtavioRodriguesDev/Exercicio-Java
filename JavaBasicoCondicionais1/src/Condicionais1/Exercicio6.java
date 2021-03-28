package Condicionais1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

// Ler um número e se for maior que 20, mostrar a metade desse número;

		Scanner in = new Scanner(System.in);

		System.out.println("Informe um número: ");

		int number = in.nextInt();
		var calculo = number / 2;

		if (number > 20) {
			System.out.println("A metade deste número é = " + calculo);
		} else
			System.out.println("O número informado foi = " + number);

		in.close();

	}
}
