package ExerciciosMauricio;

import java.util.Scanner;

public class AntecessorSucessorNumeroInteiro {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite um n�mero de 0 a 10");
	int numero = input.nextInt();
	
	int antecessor = (numero - 1);
	int sucessor = (numero + 1);
	
	System.out.println("O n�mero antecessor de " + numero + " �: " + antecessor);
	System.out.println("");
	System.out.println("O n�mero sucessor de " + numero + " �: " + sucessor);
	
	input.close();
	
	
	
		
		
		
		
		
	}
}
