package Condicionais1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

//Dada a idade de um nadador, informe sua categoria.

		Scanner in = new Scanner(System.in);

		System.out.println("Informe sua idade");
		int idade = in.nextInt();
		
		if (idade <= 10) {
			System.out.println(idade + " anos" + " =" + " Sua categoria � Infantil");
		} else if (idade <= 17)
			System.out.println(idade + " anos " + " = " + "Sua categoria � Juvenil");
		else if (idade > 17)
			System.out.println(idade + " anos" + " =" + " Sua categoria � Senior");

		in.close();

	}
}
