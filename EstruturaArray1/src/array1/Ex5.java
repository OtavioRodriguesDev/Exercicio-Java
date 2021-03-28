package array1;

public class Ex5 {
	public static void main(String[] args) {

		int[] vetorA = { 10 };
		int[] vetorB = { 10 };
		int[] vetorR = new int[1];

		for (int i = 0; i < vetorR.length; i++) {
			vetorR[i] = vetorA[i] + vetorB[i];

		}

		for (int somaVetores : vetorR) {
			System.out.println("Soma dos vetores = " + somaVetores);

		}
	}
}
