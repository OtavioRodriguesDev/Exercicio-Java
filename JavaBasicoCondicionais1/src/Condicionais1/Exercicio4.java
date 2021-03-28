package Condicionais1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
	
//Verifique se a letra digitada é "F" ou "M"
//F - Feminino, M - Masculino, Sexo Inválido
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite uma letra: ");
	String letra = sc.next();
	
	if (letra.equalsIgnoreCase("f")) {
		System.out.println("Sexo Feminino");
	}else if (letra.equalsIgnoreCase("m"))
		System.out.println("Sexo Masculino");
	else {
		System.out.println("Sexo invalido");
	}	
		sc.close();
		
		
	
	}
		
}
