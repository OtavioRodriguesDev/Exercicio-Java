package Condicionais2;

import java.util.Scanner;

public class Exercicio4 {
 public static void main(String[] args) {
	
//Em uma f�brica, uma m�quina precisa de manuten��o sempre que o n�mero de pe�as defeituosas supera 10% da produ��o. 
//Dados o total de pe�as produzidas e o total de pe�as defeituosas, informe se a m�quina precisa de manuten��o;
	 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o total de pe�as produzidas");
	float PecasProduzidas = sc.nextFloat();
	System.out.println("Informe o total de pe�as defeituosas");
	float PecasDefeito = sc.nextFloat();
	
	System.out.println("Pe�as produzidas = " + PecasProduzidas);
	System.out.println("Pe�as defeituosas = " + PecasDefeito);
	
	double prod = (PecasProduzidas * 10/100) + PecasProduzidas;
	
	if (PecasDefeito > prod) {
		System.out.println("Warning !!!, M�quina precisa de manuten��o.");
	}
	 
	 
 	}
}
