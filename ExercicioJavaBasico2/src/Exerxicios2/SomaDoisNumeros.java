package Exerxicios2;

import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero ");
		float number1 = input.nextFloat();
		System.out.println("Digite o segundo n�mero ");
		float number2 = input.nextFloat();
		
		double soma = number1 + number2;
		System.out.println("A soma dos dois n�meros �: " + soma);
		
		
		
		
	}
}
