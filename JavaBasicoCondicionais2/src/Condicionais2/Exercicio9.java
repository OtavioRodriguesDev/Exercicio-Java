package Condicionais2;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
//A Loja Mam�o com A��car est� vendendo seus produtos em 5 (cinco) presta��es sem juros para compras acima de R$250,00. 
//Fa�a um algoritmo que receba um valor de uma compra e mostre o valor das presta��es se poss�vel.			

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ol�, seja bem vindo!");
		System.out.println("Informe o valor total do pedido");
		double vlrtotal = sc.nextDouble();
		
		double PrestacaoSemJuros = vlrtotal /5;
		
		if (vlrtotal > 250) {
			System.out.println("Valor total do pedido = " + vlrtotal);
			System.out.println("Valor total a ser pago das parcelas s/juros = " + PrestacaoSemJuros);
		}else if (vlrtotal < 250) 
			System.out.println("Valor total a ser pago = " + vlrtotal);
		
		
	}
}
