package fundamentos;

public class TipoString {
	public static void main(String[] args) {
	 
		String string = " minha string ";
		
		//Comando "substring" serve para pegar uma parte especifica dentro da string;
		//Precisa especificar quantos caracteres tem dentro da string. Nesse caso, tem 14;
		//Conta tamb�m com os espa�os dos caracteres;
		System.out.println(string.substring(0,7));
		
		//charAt serve para pegar um caracter especifico dentro da var/string;
		System.out.println(" Char na posi��o: " + string.charAt(9));
		
		//length serve para contar o total de caracteres dentro da var/string;
		System.out.println("Quantidade" + string.length());
		
		//Comando "Upper" deixa tudo maiusculo;
		System.out.println("Upper:" + string.toUpperCase());
		
		//"Sem Trim" coloca os espa�os na saida do c�digo. EX: Texto, Numero, etc;
		System.out.println("Sem Trim: [" + string + "]");
		
		//"Com Trim" Tira os espa�os na saida do c�digo. EX: Texto, Numero, etc;
		System.out.println("Com Trim: [" + string.trim() + "]");
		
		//"string.contains" serve para ver se cont�m algo especifico na var/string;
		System.out.println("Cont�m M: " + string.contains("m"));
		System.out.println("Cont�m F: " + string.contains("f"));
		
		//O comando Replace (string/var.replace), serve para substituir o que tem dentro da variavel;
		System.out.println("Replace: " + string.replace("g", "G"));
		
		//Este comando "equals", serve para verificar se a sa�da da variavel, se esta igual ou n�o;
		System.out.println("Igual:" + string.equals(" minha String "));
		
		//EqualsIgnoreCase - Ignora o que foi feito na var/string(dentro da var);
		System.out.println("EqualsIgnoreCase: " + string.equalsIgnoreCase(" minha string "));
		
		//Este comando "String[]", se torna um vetor para separar o que tem na var/string;
		//Ex: "Aula;de;Java - com este comando, ele tira o " ; " e deixa tudo separado;
		String[] teste = "Aula;de;Java".split(";");
		
		System.out.println(teste[0]);
		
		var nome = "Ot�vio";
		
		
	}

}
