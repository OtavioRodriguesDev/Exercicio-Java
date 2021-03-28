package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informações do Funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3134845223L;
		
		//Tipos reais
		float salario = 11445.80F;
		double vendasAcumuladas = 2_991_797_103.89;
		
		// Tipo boolean 
		boolean estaDeFerias = false; //true
		
		//Tipo caracter
		char status = 'A'; //ativo
		
		//dias de empresa do funcionário
		System.out.println(anosDeEmpresa*365);
		
		//Número viagens
		System.out.println(numerosDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		System.out.println(id + "ganha ->" + salario);
		System.out.println("Ferias?" + estaDeFerias);
		System.out.println("Status" + status);

	}

}
