package fundamentos;

import java.util.Scanner;

public class Import {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Seu nome �:" + nome);
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
				
		System.out.println("Sua idade �:" + idade);
		
		System.out.println("Digite onde voc� mora");
		var pais = entrada.next();
		
		System.out.println("Voc� mora em: " + pais);
		
		
		
		
		
	}

}
