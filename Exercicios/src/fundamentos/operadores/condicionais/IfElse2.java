package fundamentos.operadores.condicionais;

import java.util.Scanner;

public class IfElse2 {
	public static void main(String[] args) {

// Solicitar 3 números e mostrar o maior

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 números inteiros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o maior número ! ");
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é o maior número ! ");
		} else if (num3 > num1 && num3 > num2)
			System.out.println(num3 + " é o maior número ! ");
		sc.close();
	}
}
