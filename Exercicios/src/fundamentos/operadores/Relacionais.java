package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
	
		int a = 8;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		
		double nota = 9.9;
		
		boolean bomComportamento = false;
		boolean passouPorMedia = nota > 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		if (temDesconto) {
			System.out.println("Recebeu desconto!!!");
		}
	}
}
