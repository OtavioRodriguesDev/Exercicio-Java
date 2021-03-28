package Exerxicios2;

import java.util.Scanner;

public class SomaDoisNumeros {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número ");
		float number1 = input.nextFloat();
		System.out.println("Digite o segundo número ");
		float number2 = input.nextFloat();
		
		double soma = number1 + number2;
		System.out.println("A soma dos dois números é: " + soma);
		
		
		
		
	}
}
