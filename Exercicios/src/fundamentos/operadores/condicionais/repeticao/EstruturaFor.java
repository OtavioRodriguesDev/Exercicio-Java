package fundamentos.operadores.condicionais.repeticao;

import java.util.Scanner;

public class EstruturaFor {
	public static void main(String[] args) {
		
//Fazer uma tabuada;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe qual tabuada deseja: ");
	int num = sc.nextInt();
		
	for (int i = 1; i <= 10; i++) {
		System.out.println(num + " + " + i + " = " + (num*i) );
		
	}
		
	
	}
}
