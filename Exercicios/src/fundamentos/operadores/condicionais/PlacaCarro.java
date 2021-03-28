package fundamentos.operadores.condicionais;

import java.util.Scanner;

public class PlacaCarro {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe a placa do veículo");
	String placa = sc.next();
	
	char digito = placa.charAt(7);
	
	switch (digito) {
	case 1:
		System.out.println("Você pode transitar segunda");
		break;

	default:
		break;
	}
		
		
		
		
		
		
		
		
	}
}
