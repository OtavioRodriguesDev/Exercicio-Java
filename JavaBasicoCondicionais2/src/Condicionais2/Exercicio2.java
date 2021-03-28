package Condicionais2;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {

//Elabore um programa que receba dois números inteiros e mostre para o usuário
//um menu com as opções: Adição, Subtração, Divisão e Multiplicação;

		String menu = JOptionPane.showInputDialog("Escolha uma das operações: " + "1 - ADIÇÃO \n" + "2- SUBTRAÇÃO \n"
				+ "3 - DIVISÃO \n" + "4 - MULTIPLICAÇÃO \n");

		// System.out.println("========================================================================");

		String valor1 = JOptionPane.showInputDialog("Digite um número inteiro: ");
		String valor2 = JOptionPane.showInputDialog("Digite outro número inteiro: ");

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
			System.out.println("Operação escolhida: " + menu + "-ADIÇÃO");
			System.out.println("Números escolhidos: " + num1 + " | " + num2);
			System.out.println("Resultado: " + num1 + " + " + num2 + " = " +  soma);
			break;
		case "2":
			System.out.println("Operação escolhida: " + menu + "-SUBTRAÇÃO");
			System.out.println("Números escolhidos: " + num1 + " | " + num2);
			System.out.println("Resultado: " + num1 + " - " + num2 + " = " + sub);
			break;
		case "3":
			System.out.println("Operação escolhida: " + menu + "-DIVISÃO");
			System.out.println("Números escolhidos: " + num1 + " | " + num2);
			System.out.println("Resultado: " + num1 + " / " + num2 + " = " + div);
			break;
		case "4":
			System.out.println("Operação escolhida: " + menu + "-MULTIPLICAÇÃO");
			System.out.println("Números escolhidos: " + num1 + " | " + num2);
			System.out.println("Resultado: " + num1 + " * " + num2 + " = " + multi);
		default:
			break;
		}

	}

}
