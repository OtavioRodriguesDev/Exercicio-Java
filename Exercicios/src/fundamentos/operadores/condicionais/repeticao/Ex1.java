package fundamentos.operadores.condicionais.repeticao;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número inteiro: ");
	int num = sc.nextInt();
	
	int i = 1;
	
	while (i <= num) {
		System.out.println(i);
		i++;
	}
	
		
	}
}
