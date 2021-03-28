package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		 
		double fahrenheit = 90.0;
		final double fator = 5.0 / 9;
		final double FORM = 32;
		
		double conversao = (fahrenheit - FORM) * fator;
		
		System.out.println("celcius= " + conversao + "C");
		
		
	}
}
