package repeticao1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

///Faça um programa que só saia quando o usuário escolher a opção de saída.

		int i = 1;
		int num;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Escolha uma opção: \n" + "1 - Comprar produtos \n" + "2 - Falar com atendente \n" 
					+ "0 - Sair \n");
			num = sc.nextInt();
			i++;
		} while (num != 0);

		System.out.println("Obrigado por utilizar o sistema!");
		sc.close();
	}
}
