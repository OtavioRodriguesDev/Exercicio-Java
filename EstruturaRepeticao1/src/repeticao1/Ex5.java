package repeticao1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

///Fa�a um programa que s� saia quando o usu�rio escolher a op��o de sa�da.

		int i = 1;
		int num;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Escolha uma op��o: \n" + "1 - Comprar produtos \n" + "2 - Falar com atendente \n" 
					+ "0 - Sair \n");
			num = sc.nextInt();
			i++;
		} while (num != 0);

		System.out.println("Obrigado por utilizar o sistema!");
		sc.close();
	}
}
