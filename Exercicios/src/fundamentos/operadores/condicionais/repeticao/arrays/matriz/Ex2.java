package fundamentos.operadores.condicionais.repeticao.arrays.matriz;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {

		int [][] matriz = new int [3][10];

		for (int i = 0; i < matriz.length; i++) {
			 for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = j;
			}	
			
			}
		
		for (int[] js : matriz) {
			System.out.println(Arrays.toString(js));
			
		}

	}
}