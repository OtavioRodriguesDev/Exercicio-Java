package fundamentos.operadores.condicionais;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PostoGasolina {
 public static void main(String[] args) {
//Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
// o	�lcool:
// o	at� 20 litros, desconto de 3% por litro
// o	acima de 20 litros, desconto de 5% por litro
// o	Gasolina:
// o	at� 20 litros, desconto de 4% por litro
// o	acima de 20 litros, desconto de 6% por litro 
//Escreva um algoritmo que leia o n�mero de litros vendidos, 
//o tipo de combust�vel (codificado da seguinte forma: A-�lcool, G-gasolina), 
//calcule e imprima o valor a ser pago pelo cliente 
// sabendo-se que o pre�o do litro da gasolina � R$ 4,50 o pre�o do litro do �lcool � R$ 2,90.
	
	 
	 String menu = JOptionPane.showInputDialog("Esolha uma das op��es: \n" + 
		 "G - Gasolina \n" + "A - �lcool \n");
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Litros vendidos ?: ");
	 double litros = sc.nextDouble();
	 
	 double totalA = 2.90 * litros; 
	 double totalG = 4.50 * litros;
	 
	 switch (menu.toUpperCase()) {
	case "A":
		if (litros <= 20) {
			System.out.println("Valor total = " + totalA);
			System.out.println("Total de desconto5 = " + ( 3 * totalA /100));
			System.out.println("Total a ser pago = " + (totalA - 3 * totalA /100));
		}else if (litros > 20) {
			System.out.println("Valor total = " + totalA);
			System.out.println("Total de desconto  = " + ( 5 * totalA /100));
			System.out.println("Total a ser pago = " + (totalA - 5 * totalA /100) );
		}
		break;
	case "G":
		if (litros <= 20) {
			System.out.println("Valor total a ser pago = " + totalG);
			System.out.println("Total de desconto = " + (4 * totalG /100));
			System.out.println("Total a ser pago = " + (totalG - 4 * totalG /100));
		}else if (litros > 20) {
			System.out.println("Valor total = " + totalG);
			System.out.println("Valor de desconto = " + (6 * totalG /100));
			System.out.println("Valor a ser pago  = " + (totalG - 6 * totalG /100));
			System.out.println("Obrigado e volte sempre !!");
		}
		break;
	default:
		break;
	}	
	
	
	 
	 
	
 	}
}
