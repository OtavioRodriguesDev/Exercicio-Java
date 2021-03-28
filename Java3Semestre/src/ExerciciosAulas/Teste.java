package ExerciciosAulas;

public class Teste {
	public static int soma(int vet[]) {
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}

		return soma;
	}

	public static void main(String[] args) {
		int vetor[] = new int[] { 10, 11 };
		System.out.println(soma(vetor));
	}

}