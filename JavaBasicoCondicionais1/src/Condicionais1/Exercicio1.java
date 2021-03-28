package Condicionais1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	
//Faça um programa que peça dois números e imprima o maior deles;		
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digite dois números: ");
	double num1 = in.nextDouble();
	double num2 = in.nextDouble();

	if (num1 > num2 ) {
		System.out.println("O maior número é = " + num1);
	}
	
	else {
		System.out.println("O maior número é = " + num2);
	}
	
	in.close();
		
		
		
		
		
		
		
		
	}
}
