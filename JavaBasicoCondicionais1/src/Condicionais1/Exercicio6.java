package Condicionais1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

// Ler um n�mero e se for maior que 20, mostrar a metade desse n�mero;

		Scanner in = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");

		int number = in.nextInt();
		var calculo = number / 2;

		if (number > 20) {
			System.out.println("A metade deste n�mero � = " + calculo);
		} else
			System.out.println("O n�mero informado foi = " + number);

		in.close();

	}
}
