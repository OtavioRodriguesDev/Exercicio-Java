package repeticao1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

//Escrever um programa de computador que leia 10 números inteiros e, 
//ao final, apresente a soma de todos os números lidos
		
	
	int i = 1;
	int soma = 0;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe 10 números inteiros: ");
	
	while (i <= 10) {
		int num = sc.nextInt();
		soma+=num;
		i++;
	}
	
	System.out.println("Soma dos números = ");
	
	sc.close();
		
	}
}
