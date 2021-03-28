package fundamentos.operadores;

import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		double num1 = input.nextDouble();
		
		System.out.println("Digite o segundo número ");
		double num2 = input.nextDouble();
		
		System.out.println("Informe qual operação deseja realizar");
		String opera = input.next();
		
		double calculo = ( (opera == "+") ? num1 + num2 : 0 );
		System.out.println(calculo);
		
		
		
		
		
		
	
		
		
		
		
			
		
	}
}
