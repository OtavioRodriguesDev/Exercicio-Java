package repeticao2;

public class Ex6 {
	public static void main(String[] args) {

//Desenvolva um algoritmo que calcula o quadrado do números de 10 a 20.
		
		int cont = 10;
		
		while (cont <= 20) {
			int quad = cont * cont;
			System.out.println(cont + "x" + cont + " = " + quad);
			cont++;
		}
		
	}
}
