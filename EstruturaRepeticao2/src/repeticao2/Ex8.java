package repeticao2;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
//Desenvolva um algoritmo que receba dez números e calcule a média desses dez números.		
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		while (i < 10) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			double media = num / 10;
			System.out.println("Média dos números = " + media);
			i++;
		}
		
	}
}
