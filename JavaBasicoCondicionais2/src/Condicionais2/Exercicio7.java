package Condicionais2;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
	
//Em uma papelaria, at� 100 folhas, a c�pia custa R$0,25, e acima de 100 folhas custa R$0,20. 
//Dado o total de c�pias, informe o total a ser pago.		
		
	Scanner sc = new Scanner(System.in);	
		
	System.out.println("Informe o n�mero de c�pias");
	int QuantidadeCopias = sc.nextInt();
	System.out.println("Informe o n�mero de folhas");
	int QuantidadeFolhas = sc.nextInt();
	
	double soma1 = QuantidadeCopias * 0.25;
	double soma2 = QuantidadeCopias * 0.20;
		
	if (QuantidadeFolhas <= 100) {
		System.out.println("Valor total a ser pago = " + soma1);
	}else if (QuantidadeFolhas > 100)
		System.out.println("Valor total a ser pago = " + soma2);
	
	sc.close();
	}
}
