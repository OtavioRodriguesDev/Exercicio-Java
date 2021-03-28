package repeticao2;

public class Ex5 {
	public static void main(String[] args) {

//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. 		

		int i = 1000;

		while (i <= 1999) {
			i++;

			if (i % 11 == 5) {
				System.out.print("Números com resto 5 = ");
				System.out.println(i);

			}
		}

	}
}
