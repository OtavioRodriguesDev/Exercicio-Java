package array1;

public class Ex4 {
	public static void main(String[] args) {
		
		
		String[] vetorX = {"oi", "olá", "hello"};
		String[] vetorY = {"Otávio", "ADS", "JAVA"};
		String[] vetorR = new String[6];
		
		for (int i = 0; i < vetorX.length; i++) {
			vetorR[i] = vetorX[i];
			
		}
		
		int j = 0;
		for (int i = 3; i < vetorR.length; i++) {
			vetorR[i] = vetorY[j];
			j++;
			
		}
		
		for (String Vetor : vetorR) {
			System.out.println(Vetor);
			
		}
		
	}
}
