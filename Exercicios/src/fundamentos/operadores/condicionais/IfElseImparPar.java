package fundamentos.operadores.condicionais;

import java.util.Scanner;

public class IfElseImparPar {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Digite um n�mero");
	int num = in.nextInt();
	
	
	if (num  % 2 == 0) {
		System.out.println("N�mero par");
	} else {
		System.out.println("N�mero �mpar");
	}
	
	in.close();
	
		
		
		
		
		
		
		
		
		
		
	}
}
