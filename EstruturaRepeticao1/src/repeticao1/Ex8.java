package repeticao1;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {

//Elabore um programa que receba 5 n�meros e imprima somente os positivos.	
	
			
	int i = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um n�mero: ");
	
	while (i < 5) {
	int numeros = sc.nextInt();
	i++;
	
	if (numeros > 0) {
		System.out.println("N�meros positivos = " + numeros);
	}
		
		}
		
	}
}
