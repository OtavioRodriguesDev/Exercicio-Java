package ExerciciosAulas;

//fazer uma função que recebe um vetor de números inteiros, 
//calcula a soma de todos eles e retorna esse valor

class Main {
	public static int soma(int vet[]) {

		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}

		return soma;
	}

	public static void main(String[] args) {
		int vetor [] = new int[]{10,11};
		System.out.println(soma(vetor));
	}
	
	
	
}