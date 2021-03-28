package Exerxicios2;

import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);	
	
	System.out.println("Digite a medida do quadrado");
	float medida = in.nextFloat();
	
	float A = (medida * medida);
	
	double dobro = (A * 2);
	
	System.out.println("A área do quadrado = " + A);
	System.out.println("");
	System.out.println("O dobro da área = " + dobro);
	
	in.close();
	
	
		
		
		
	}
}
