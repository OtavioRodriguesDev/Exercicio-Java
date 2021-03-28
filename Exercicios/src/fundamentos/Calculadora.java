package fundamentos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Digite um número");
		double num1 = input.nextDouble();
		
		System.out.println("Digite outro número");
		double num2 = input.nextDouble();
		
		double soma = (num1 + num2);
		System.out.println(soma);
		
		double sub = (num1 - num2);
		System.out.println( sub);
		
		double multi = (num1 * num2);
		System.out.println(multi);
		
		double div = (num1 / num2);
		System.out.println(div);
		
		input.close();
				
		
	}

}
