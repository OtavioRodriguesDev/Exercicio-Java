package fundamentos.operadores.condicionais.repeticao.arrays.matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		int alunos = sc.nextInt();
		
		System.out.print("Informe a quantidade de notas: ");
		int qntNotas = sc.nextInt();
		
		double [] [] notasAlunos = new double [alunos] [qntNotas];
		
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				
			}
			System.out.println();
		}
		
		System.out.println("Total da média = ");
		
		double soma = 0;
		
		for (int i = 0; i < notasAlunos.length; i++) {
			
			soma = 0;
		for (int j = 0; j < notasAlunos.length; j++) {
			soma += notasAlunos[i][j];
			
		}
		System.out.println("Média da turma = " + i + (soma / qntNotas));
		}
	}

}
