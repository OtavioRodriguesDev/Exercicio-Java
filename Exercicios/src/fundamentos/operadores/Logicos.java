package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {

	boolean condicao1 = true;
	boolean condicao2 = 3 > 7;
	
	System.out.println("conjun��o - and " + (condicao1 && condicao2));
	System.out.println("disjun��o - or  " + (condicao1 || condicao2));
	System.out.println("or exlusivo " + (condicao1 ^ condicao2));
	
	System.out.println(!condicao1);
	System.out.println(!condicao2);
	
	System.out.println("\nTabela verdade E");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	
	System.out.println("\nTabela verdade OU");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println("\nTabela verdade Xor ou Ou exlusivo");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);
		
		
		
		
		
		
		
	}

}