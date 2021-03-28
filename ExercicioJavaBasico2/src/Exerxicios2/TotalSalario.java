package Exerxicios2;

import javax.swing.JOptionPane;

public class TotalSalario {
	public static void main(String[] args) {
		
	String valor1 = JOptionPane.showInputDialog("Quanto você recebe por hora ?");
	String valor2 = JOptionPane.showInputDialog("Qual o total de horas trabalhadas ?");
	
	double GanhoPorHora = Double.parseDouble(valor1);
	double HorasTrabalhadas = Double.parseDouble(valor2);
	
	double totalslr = (GanhoPorHora * HorasTrabalhadas);
	System.out.println("Você recebeu o total de " + totalslr + " Este mês ");
	
		
		
		
		
      		
	}

}
