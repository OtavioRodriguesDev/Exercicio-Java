package Condicionais2;

import java.util.Scanner;

public class Exercicio4 {
 public static void main(String[] args) {
	
//Em uma fábrica, uma máquina precisa de manutenção sempre que o número de peças defeituosas supera 10% da produção. 
//Dados o total de peças produzidas e o total de peças defeituosas, informe se a máquina precisa de manutenção;
	 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o total de peças produzidas");
	float PecasProduzidas = sc.nextFloat();
	System.out.println("Informe o total de peças defeituosas");
	float PecasDefeito = sc.nextFloat();
	
	System.out.println("Peças produzidas = " + PecasProduzidas);
	System.out.println("Peças defeituosas = " + PecasDefeito);
	
	double prod = (PecasProduzidas * 10/100) + PecasProduzidas;
	
	if (PecasDefeito > prod) {
		System.out.println("Warning !!!, Máquina precisa de manutenção.");
	}
	 
	 
 	}
}
