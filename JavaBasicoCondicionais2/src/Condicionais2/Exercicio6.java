package Condicionais2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
//Fa�a um Programa que pergunte em que turno voc� estuda. 
//Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. 
//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ol�, qual turno voc� estuda ?");
		System.out.println("Escolha uma das op��es:\n" 
				+ "  M-Matutino \n" + 
				  "  V-Vespertino \n" + 
				  "  N-Noturno \n");
		
		String turno = sc.next();

		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		}else if (turno.equalsIgnoreCase("V"))
			System.out.println("Boa tarde!");
		else if (turno.equalsIgnoreCase("N"))
			System.out.println("Boa noite!");

		else {
			System.out.println("Valor Inv�lido!");
		}
			
			
			
	}	
}
