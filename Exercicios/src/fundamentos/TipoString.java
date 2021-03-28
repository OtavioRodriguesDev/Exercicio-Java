package fundamentos;

public class TipoString {
	public static void main(String[] args) {
	 
		String string = " minha string ";
		
		//Comando "substring" serve para pegar uma parte especifica dentro da string;
		//Precisa especificar quantos caracteres tem dentro da string. Nesse caso, tem 14;
		//Conta também com os espaços dos caracteres;
		System.out.println(string.substring(0,7));
		
		//charAt serve para pegar um caracter especifico dentro da var/string;
		System.out.println(" Char na posição: " + string.charAt(9));
		
		//length serve para contar o total de caracteres dentro da var/string;
		System.out.println("Quantidade" + string.length());
		
		//Comando "Upper" deixa tudo maiusculo;
		System.out.println("Upper:" + string.toUpperCase());
		
		//"Sem Trim" coloca os espaços na saida do código. EX: Texto, Numero, etc;
		System.out.println("Sem Trim: [" + string + "]");
		
		//"Com Trim" Tira os espaços na saida do código. EX: Texto, Numero, etc;
		System.out.println("Com Trim: [" + string.trim() + "]");
		
		//"string.contains" serve para ver se contém algo especifico na var/string;
		System.out.println("Contém M: " + string.contains("m"));
		System.out.println("Contém F: " + string.contains("f"));
		
		//O comando Replace (string/var.replace), serve para substituir o que tem dentro da variavel;
		System.out.println("Replace: " + string.replace("g", "G"));
		
		//Este comando "equals", serve para verificar se a saída da variavel, se esta igual ou não;
		System.out.println("Igual:" + string.equals(" minha String "));
		
		//EqualsIgnoreCase - Ignora o que foi feito na var/string(dentro da var);
		System.out.println("EqualsIgnoreCase: " + string.equalsIgnoreCase(" minha string "));
		
		//Este comando "String[]", se torna um vetor para separar o que tem na var/string;
		//Ex: "Aula;de;Java - com este comando, ele tira o " ; " e deixa tudo separado;
		String[] teste = "Aula;de;Java".split(";");
		
		System.out.println(teste[0]);
		
		var nome = "Otávio";
		
		
	}

}
