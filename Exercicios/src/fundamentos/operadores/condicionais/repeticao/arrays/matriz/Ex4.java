package fundamentos.operadores.condicionais.repeticao.arrays.matriz;

public class Ex4 {
	public static void main(String[] args) {

		int[][] num = new int[6][6];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = i;

			}
			
			
		}
	}
}
