package ExerciciosAulas;

public class Ex3 {
	public static void main(String[] args) {
		int vet1[] = new int[3];
		vet1[0] = 6;
		vet1[1] = 9;
		vet1[2] = 2;

		int vet2[] = new int[3];
		vet2[0] = 2;
		vet2[1] = 9;
		vet2[2] = 2;

		if (vet1.length == vet2.length) {
			boolean saoIguais = true;
			for (int i = 0; i < vet1.length; i++) {
				if (vet1[i] != vet2[i]) {
					saoIguais = false;
					break;
				}
			}
			if (saoIguais) {
				System.out.println("Sao iguais");
			} else {
				System.out.println("Sao diferentes");
			}
		} else {
			System.out.println("Sao diferentes");
		}
	}

}
