package repeticao1;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

//Faça o mesmo que antes, porém, ao invés de ler 10 números, 
//o programa deverá ler e somar números até que o valor digitado seja zero ( 0 ).	

		int i = 1;
		int soma = 0;
		double numeros = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite números: ");
		
		while (i > 0) {
			numeros = sc.nextDouble();
			soma += numeros;
			i++;
			
			if (numeros > 0) {
				System.out.println("Soma dos números = " + soma);
			}
			else {
				System.out.println("Não é possível somar.");
			}
		}
			
		
	}

}
