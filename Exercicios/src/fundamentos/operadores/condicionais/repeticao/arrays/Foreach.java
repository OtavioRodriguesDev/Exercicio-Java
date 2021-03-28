package fundamentos.operadores.condicionais.repeticao.arrays;

public class Foreach {
	public static void main(String[] args) {
		
		float[] pesoProdutos = {10.2f, 0, 0, 0, 100, 0, 0, 0, 0, 30.5f};
		float total = 0;
		for (float peso : pesoProdutos) {
			System.out.println(peso);
			total += peso;
			
		}
		System.out.println("----------------");
		System.out.println("Total: " + total);
	}
}
