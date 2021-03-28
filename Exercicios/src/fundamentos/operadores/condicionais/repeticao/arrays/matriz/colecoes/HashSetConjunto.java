package fundamentos.operadores.condicionais.repeticao.arrays.matriz.colecoes;

import java.util.HashSet;

public class HashSetConjunto {
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //o double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho � " + conjunto.size());
		System.out.println(conjunto);
	}

}
