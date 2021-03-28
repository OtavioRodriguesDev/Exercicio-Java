package ExerciciosMauricio;

import java.util.Scanner;

public class ReajusteSaldo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu saldo");
		var saldo = sc.nextDouble();
		
		double reajuste = (1 * saldo) /100;
		
		System.out.println("O seu saldo com reajuste de 1% é");
		System.out.println(reajuste + saldo);
		sc.close();

	}

}
