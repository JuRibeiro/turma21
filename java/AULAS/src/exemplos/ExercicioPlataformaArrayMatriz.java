package exemplos;

import java.util.Scanner;

public class ExercicioPlataformaArrayMatriz 
{
	public static void main (String args[])
	{
		Scanner leia = new Scanner (System.in);
		//matriz multi dimensaional 
		int [][] matriz = new int [3][3];
		
		System.out.println("Matriz M[3][3] \n");
		
		//for encadeado linha e coluna
		for (int linha=0; linha < 3; linha++)
		{
			for(int coluna=0; coluna<3; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",(linha+1), (coluna+1));
				matriz [linha][coluna] = leia.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Resultado da Matriz:\n");
		
		for (int linha=0; linha < 3; linha++)
		{
			for(int coluna=0; coluna<3; coluna++)
			{
				System.out.printf("\t %d \t", matriz[linha][coluna], "\n\n");
				
			}
			System.out.println();
		}
		
		leia.close();
	}

}
