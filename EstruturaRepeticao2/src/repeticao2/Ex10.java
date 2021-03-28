package repeticao2;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

//10.	Faça um programa que peça para n pessoas a sua idade, 
//ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25, 
//26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int media = 0;

		while (i <= 15) {
			System.out.print("Informe sua idade: ");
			int idade = sc.nextInt();
			media += idade / 15;
			i++;

			if (media >= 0 && media <= 25) {
				System.out.println("A turma é jovem. ");
			} else {
				if (media >= 26 && media <= 60) {
					System.out.println("A turma é adulta.");
				} else {
					System.out.println("A turma é idosa. ");
				}
			}

		}

	}
}
