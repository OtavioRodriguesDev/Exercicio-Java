package Condicionais1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

//Fa�a um algoritmo que receba um n�mero e mostre uma mensagem
//Caso este n�mero seja maior que 10;
		
		Scanner in = new Scanner(System.in);

		System.out.println("Informe um n�mero");
		int num = in.nextInt();

		if (num > 10) {
			System.out.println("Este n�mero � maior que 10");
		}

		else {
			System.out.println("O n�mero informado �: " + num);
		}

		in.close();

	}
}
