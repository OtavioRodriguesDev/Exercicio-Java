package repeticao1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
//Escreva um programa que leia um valor correspondente ao n�mero de jogadores de um time de v�lei. 
//O programa dever� ler uma altura para cada um dos jogadores e, ao final, informar a altura m�dia do time.	
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a altura dos jogadores: ");

		int i = 0;
		double media = 0;
		
		while (i < 6) {
		double altura = sc.nextDouble();
		i++;
		media+= altura / 6;
	
		}
		
		System.out.println("A altura m�dia do time = " + media);
}	}

