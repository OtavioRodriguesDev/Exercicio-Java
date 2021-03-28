package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 números do VetorN: ");
		
		int[] VetorN = new int[10];
		 
		VetorN[0] = sc.nextInt();
		int elementoMenor = VetorN[0], posicao = 0;
		
		for(int i= 0; i < VetorN.length - 1; i++) {
		 VetorN[i] = sc.nextInt();
		
		
			if (VetorN[i] < elementoMenor) {
		        elementoMenor = VetorN[i];
		        posicao = i;
		    }
		
		}
		
		System.out.println(Arrays.toString(VetorN));
		System.out.println("O menor elemento de N = " + elementoMenor + ", e a sua posição é: " + posicao);
		
	}
}
