package Condicionais2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
	
//Crie um programa que receba o valor de total de venda de um pedido. 
//E Caso o pagamento for a vista (Desconto de 5%), 
//se pagamento for Cartão Débito (Valor sem desconto), se pagamento for em Cheque (Acréscimo de 10%).
		

	Scanner sc = new Scanner(System.in);
		
	System.out.println("Informe o valor total do pedido: ");
	double vlrtotal = sc.nextInt();
	System.out.println("Qual a forma de pagamento ?");
	String pagamento = sc.next();

	double PagamentoDinheiro = (vlrtotal * -10) /100;
	double PagamentoCheque = (vlrtotal * 10) /100; 
	
	if (pagamento.equalsIgnoreCase("Avista")) {
		System.out.println(" [" + pagamento + "]" + "Valor total a ser pago = " + PagamentoDinheiro);
	} 
	
	if (pagamento.contains("Debito")) {
		System.out.println(vlrtotal);
	}
	
	if (pagamento.contains("Cheque")) {
		System.out.println(vlrtotal + PagamentoCheque);
	}
	
	}
}
