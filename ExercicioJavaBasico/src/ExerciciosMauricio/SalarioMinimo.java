package ExerciciosMauricio;

import java.util.Scanner;

public class SalarioMinimo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu salário ");
		double salario = input.nextDouble();
		
		double SLMIN = 1045.00;
		double calculo = (salario / SLMIN);
		
		int calculofinal = (int) calculo;
		
		System.out.println("Você recebe " + calculofinal + " Salário(s) mínimo(s) ");
		
		input.close();
	}
}
