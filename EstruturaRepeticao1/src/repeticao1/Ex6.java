package repeticao1;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

//Fa�a o mesmo que antes, por�m, ao inv�s de ler 10 n�meros, 
//o programa dever� ler e somar n�meros at� que o valor digitado seja zero ( 0 ).	

		int i = 1;
		int soma = 0;
		double numeros = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite n�meros: ");
		
		while (i > 0) {
			numeros = sc.nextDouble();
			soma += numeros;
			i++;
			
			if (numeros > 0) {
				System.out.println("Soma dos n�meros = " + soma);
			}
			else {
				System.out.println("N�o � poss�vel somar.");
			}
		}
			
		
	}

}
