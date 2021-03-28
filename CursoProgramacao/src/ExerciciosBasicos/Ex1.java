package ExerciciosBasicos;

public class Ex1 {
	public static void main(String[] args) {
		
// Computer which price is $ 2100,00
// Office desk which price is $ 650,50
				
// Record: 30 years old, code 5290 and gender: F

//	Measue with eight decimal places:  53,23456700
//	Rouded (three decimal places): 53,235
//  US decimal point: 53.235		
		
// %f = double
// %d = inteiro
// %s = texto
// %n = quebra de linha
				
		
		String product1 = "Computer";
		String product2 = "Office desk";
				
		int age = 30;
		int code = 5290;
		char gender = 'F';
				
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.23467;
				
		System.out.println("Products:");
		System.out.println(product1 + " which price is $ " + price1);
		System.out.println(product2 + " which price is $ " + price2);
		
		System.out.println();
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
		
		System.out.println();
		System.out.println("Measure with eight decimal places: "  + measure);	
		System.out.printf("Rounded (three decimal places: " + "%.3f%n", measure);
		
	}
}
