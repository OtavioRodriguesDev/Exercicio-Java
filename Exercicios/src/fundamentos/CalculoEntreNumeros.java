package fundamentos;

import java.util.Scanner;

public class CalculoEntreNumeros {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int num1 = in.nextInt();
		System.out.println("Digite outro número inteiro");
		int num2 = in.nextInt();
		System.out.println("Digite um número real");
		double numreal = in.nextDouble();
		
		var calculo1 = num1 * 2;
		var calculo2 = num2 /2;
		System.out.println("O produto do dobro = " + calculo1 * calculo2);
		
		var calculo3 = num1 * 3 + numreal;
		System.out.println("A soma do triplo do primeiro com o terceiro = " + calculo3);
		
		var potencia = (double) Math.pow(numreal, 3);
		System.out.println("O terceiro elevado ao cubo = " + potencia);
		
		
		
		
		
		
		
		
		
		
		
	}
}
