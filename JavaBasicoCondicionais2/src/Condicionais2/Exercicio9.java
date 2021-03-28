package Condicionais2;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
//A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros para compras acima de R$250,00. 
//Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações se possível.			

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, seja bem vindo!");
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
