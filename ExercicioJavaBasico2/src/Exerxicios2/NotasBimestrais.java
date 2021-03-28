package Exerxicios2;

import java.util.Scanner;

public class NotasBimestrais {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota do primeiro Bimestre");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite a nota do segundo Bimestre");
		double nota2 = input.nextDouble();
		
		System.out.println("Digite a nota do Terceiro Bimestre");
		double nota3 = input.nextDouble();
		
		System.out.println("Digite a nota do Quarto Bimestre");
		double nota4 = input.nextDouble();
		
		var media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("A media das suas notas bimestrais é: " + media);
		
	}
}
