package fundamentos.operadores.condicionais.repeticao.arrays.matriz;

import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {

		int[][] num = new int[10][6];

		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (i % 2 == 0) {
					num[i][j] = -1;
				} else {
					num[i][j] = 0;
				}

			}

		}

		for (int[] it : num) {
			System.out.println(Arrays.toString(it));

		}
	}
}
