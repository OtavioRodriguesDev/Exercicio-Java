package ExerciciosMauricio;

import java.util.Scanner;

public class SistemaVendasPecas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código da peça1");
		float codp1 = sc.nextFloat();
		System.out.println("Informe o código da peça2");
		float codp2 = sc.nextFloat();
		
		System.out.println("Digite o valor do IPI");
		int IPI = sc.nextInt();
		System.out.println("Digite o valor da peça1");
		double valor1 = sc.nextDouble();
		System.out.println("Digite o valor da peça2");
		double valor2 = sc.nextDouble();
		
		System.out.println("Valor da peça1 = " + valor1);
		System.out.println("Valor da peça2 = " + valor2);
		
		System.out.println("Digite a quantidade de peça1(s) ");
		int quant1 = sc.nextInt();
		System.out.println("Digite a quantidade de peça2(s) ");
		int quant2 = sc.nextInt();
		
		System.out.println("Quantidade de peça1(s) comprada(s) = " + quant1);
		System.out.println("Quantidade de peça2(s) comprada(s) = " + quant2);
		
		double vlrtotal = (valor1*quant1 + valor2*quant2)*(IPI/100+1);
		
		System.out.println("");
		System.out.println("Valor total a ser pago = " + vlrtotal);
		System.out.println("");
		System.out.println("Agradecemos pela compra e volte sempre ");
		
		sc.close();
		
		


		
		
		
		
		
		
	}

}
