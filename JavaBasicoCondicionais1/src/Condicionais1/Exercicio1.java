package Condicionais1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	
//Fa�a um programa que pe�a dois n�meros e imprima o maior deles;		
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digite dois n�meros: ");
	double num1 = in.nextDouble();
	double num2 = in.nextDouble();

	if (num1 > num2 ) {
		System.out.println("O maior n�mero � = " + num1);
	}
	
	else {
		System.out.println("O maior n�mero � = " + num2);
	}
	
	in.close();
		
		
		
		
		
		
		
		
	}
}
