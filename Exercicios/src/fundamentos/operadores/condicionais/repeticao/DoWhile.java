package fundamentos.operadores.condicionais.repeticao;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
	int menu = 0;
	System.out.println("-----------------------------------------------------------");
	System.out.print("Digite uma das opções: \n");
	System.out.println("-----------------------------------------------------------");
	
	
	do {
		System.out.println(
				"1 - Adição \n " + "2 - Subtração \n " + "3 - Divisão \n " + "4 - Multiplicação \n " + "0 - Sair \n");
		menu = sc.nextInt();
	} while (menu != 0);
		System.out.println(menu);
		
		System.out.println("Obrigado por utilizar nosso sistema");
		
	}
	

}
