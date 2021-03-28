package ExerciciosAulas;

public class Ex4Vetores {
	public static void main(String[] args) {
		
		int vet1[],vet2[],vet3[];
		
		vet1 = new int[3];
		vet1[0] = 1;
		vet1[1] = 2;
		vet1[2] = 3;
		
		vet2 = new int[3];
		vet2[0] = 8;
		vet2[1] = 9;
		vet2[2] = 10;
		
		vet3 = new int[6];
		
		for (int i = 0; i < vet1.length; i++) {
			vet3[i] = vet1[i];
			System.out.println(vet3[i]);
		}
		
		for (int j = 0; j < vet2.length; j++) {
			vet3[j + 3] = vet2[j];
			System.out.println(vet3[j + 3]);
		}
	}
}
