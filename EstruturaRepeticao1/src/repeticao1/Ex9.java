package repeticao1;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {

//Elabore um programa que receba o nome e 4 notas de 10 alunos, 
//calcule e exiba o resultado da média na tela utilizando a estrutura de repetição.		

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		double n1;
		double n2;
		double n3;
		double n4;
		String nome;

		while (cont <= 10) {
			System.out.println("Informe seu nome e insira 4 notas: ");
			nome = sc.next();
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			n4 = sc.nextDouble();
			double mediaNotas = (n1 + n2 + n3 + n4) / 4; Math.ceil(mediaNotas);
			cont++;
			System.out.println("Nome: " + nome);
			System.out.println("Sua média = " + mediaNotas);
		}

	}
}
