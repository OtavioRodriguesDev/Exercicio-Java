package fundamentos;

import java.util.Scanner;

public class Import {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Seu nome é:" + nome);
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
				
		System.out.println("Sua idade é:" + idade);
		
		System.out.println("Digite onde você mora");
		var pais = entrada.next();
		
		System.out.println("Você mora em: " + pais);
		
		
		
		
		
	}

}
