package Condicionais2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

//Faça um programa que pergunte o preço de três produtos e informe 
//qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato;
		
			
	Scanner in = new Scanner(System.in);
	
	System.out.println("Informe o preço de 3 produtos");
	double P1 = in.nextDouble();
	double P2 = in.nextDouble();
	double P3 = in.nextDouble();
	
	if (P1 < P2 && P1 < P3) {
		System.out.println(" O produto mais barato custa " + P1 + " reais" + " - compre este produto !");
	}else if (P2 < P1 && P2 < P3)
		System.out.println("O produto mais barato custa "  + P2 +  " reais" + " - compre este produto !");
	else if (P3 < P2 && P3 < P1)
		System.out.println("O produto mais barato custa "  + P3 +  " reais" + " - compre este produto !");
		
		
		
		
		
		
		
		
		
	}
}
