package fundamentos;

import java.util.Scanner;

public class LojaTintas {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);	
	
	System.out.println("Informe a quantidade de metros quadrados");
	double tamanhoParede = in.nextDouble();
	
	double quantidadeLitros = (tamanhoParede /3);
	
	double latas = Math.ceil(quantidadeLitros /18);
	
	double vlrtotal = (latas * 80);
	
	
	System.out.println("Quantidade de latas = " + latas);
	System.out.println("O valor total a ser pago = " + vlrtotal);
		
		
		
		
		
		
		
		
		
	}
}
