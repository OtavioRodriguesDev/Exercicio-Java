package repeticao2;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
//Desenvolva um algoritmo que receba dez n�meros e calcule a m�dia desses dez n�meros.		
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		while (i < 10) {
			System.out.print("Digite um n�mero: ");
			int num = sc.nextInt();
			double media = num / 10;
			System.out.println("M�dia dos n�meros = " + media);
			i++;
		}
		
	}
}
