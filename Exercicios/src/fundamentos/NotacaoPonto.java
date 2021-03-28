package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 3.5;
		
		String s = "Bom dia X";
		s = s.replace("X", "Otávio");
		s = s.toUpperCase();
		s = s.concat(" Tudo bem !?");
		
		System.out.println(s);
		
		String b = "Bom dia X"
				.replace("X", "Guilherme")
				.toLowerCase()
				.concat(" Beleza ?");
		
		System.out.println(b);
		
		
	}

}
