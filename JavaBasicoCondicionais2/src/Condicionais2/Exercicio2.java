package Condicionais2;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {

//Elabore um programa que receba dois n�meros inteiros e mostre para o usu�rio
//um menu com as op��es: Adi��o, Subtra��o, Divis�o e Multiplica��o;

		String menu = JOptionPane.showInputDialog("Escolha uma das opera��es: " + "1 - ADI��O \n" + "2- SUBTRA��O \n"
				+ "3 - DIVIS�O \n" + "4 - MULTIPLICA��O \n");

		// System.out.println("========================================================================");

		String valor1 = JOptionPane.showInputDialog("Digite um n�mero inteiro: ");
		String valor2 = JOptionPane.showInputDialog("Digite outro n�mero inteiro: ");

		double n1 = Double.parseDouble(valor1);
		double n2 = Double.parseDouble(valor2);
		
		int num1 = (int)n1;
		int num2 = (int)n2;

		var soma = (num1 + num2);
		var sub = (num1 - num2);
		var div = (num1 / num2);
		var multi = (num1 * num2);

		switch (menu) {
		case "1":
			System.out.println("Opera��o escolhida: " + menu + "-ADI��O");
			System.out.println("N�meros escolhidos: " + num1 + " | " + num2);
			System.out.println("Resultado: " + num1 + " + " + num2 + " = " +  soma);
			break;
		case "2":
			System.out.println("Opera��o escolhida: " + menu + "-SUBTRA��O");
			System.out.println("N�meros escolhidos: " + num1 + " | " + num2);
			System.out.println("Resultado: " + num1 + " - " + num2 + " = " + sub);
			break;
		case "3":
			System.out.println("Opera��o escolhida: " + menu + "-DIVIS�O");
			System.out.println("N�meros escolhidos: " + num1 + " | " + num2);
			System.out.println("Resultado: " + num1 + " / " + num2 + " = " + div);
			break;
		case "4":
			System.out.println("Opera��o escolhida: " + menu + "-MULTIPLICA��O");
			System.out.println("N�meros escolhidos: " + num1 + " | " + num2);
			System.out.println("Resultado: " + num1 + " * " + num2 + " = " + multi);
		default:
			break;
		}

	}

}
