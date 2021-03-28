package ExerciciosMauricio;

import java.util.Scanner;

public class AnoMesDia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		var anos = sc.nextInt();
		
		System.out.println("Digite os meses");
		int meses = sc.nextInt();
		
		System.out.println("Digite os dias");
		int dias = sc.nextInt();
		
		int A = 365;
		int M = 30;
		int D = 1;
		
		int calculo1 = (anos * A);
		int calculo2 = (meses * M);
		int calculo3 = (dias * D);
		
		System.out.printf("%d anos, %d meses e %d dias", anos, meses, dias);
		System.out.println("");
		System.out.println(calculo1 + calculo2 + calculo3);
		sc.close();
		
		
		

	}

}
