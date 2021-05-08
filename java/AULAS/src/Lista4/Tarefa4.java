package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Tarefa4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.
		 */
		Random random = new Random();
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double matrizSoma [][] = new double [2][2];
		double matrizSubtrair [][] = new double [2][2];
		double auxConstante =0.00;
		char op = ' ';
		
		System.out.println("Montando as matrizes\n");
		
		for (int linha=0; linha<2; linha++)
		{
			for(int coluna=0; coluna<2; coluna++)
			{
				System.out.printf("valor da Matriz1 na posição linha %d - coluna %d ", linha , coluna);
				matriz1[linha][coluna] = leia.nextDouble();
				
				System.out.printf("valor da Matriz2 na posição linha %d - coluna %d ", linha , coluna);
				matriz2[linha][coluna] = leia.nextDouble();
			}
		}
		
		do
		{
			System.out.println("(1) somar as duas matrizes");
			System.out.println("(2) subtrair a primeira matriz da segunda");
			System.out.println("(3) adicionar uma constante as duas matrizes");
			System.out.println("(4) imprimir as matrizes");
			System.out.println("Escolha uma opção: ");
			op = leia.next().charAt(0);
			
			switch (op)
			{
			
			case '1':
			{
				for(int linha=0; linha<2; linha++)
				{
					for(int coluna=0; coluna<2; coluna++)
					{
						matrizSoma[linha][coluna]= matriz1[linha][coluna]+ matriz2[linha][coluna];
						System.out.printf("Soma de m1 + m2 na posição %d - %d = %.0f + %.0f --> %.0f\n", linha,coluna, matriz1[linha][coluna], matriz2[linha][coluna], matrizSoma[linha][coluna]);
					}
				}
			}
			break;
			
			case '2':
			{
				for(int linha=0; linha<2; linha++)
				{
					for(int coluna=0; coluna<2; coluna++)
					{
						matrizSubtrair[linha][coluna]= matriz1[linha][coluna] - matriz2[linha][coluna];
						System.out.printf("Subtração de m1 - m2 na posição %d - %d = %.0f - %.0f --> %.0f\n", linha,coluna, matriz1[linha][coluna], matriz2[linha][coluna], matrizSubtrair[linha][coluna]);
					}
				}
				
			}
			break;
			
			case '3':
			{
				System.out.print("Digite o valor da constante: ");
				final double VALOR = leia.nextDouble();
				for (int linha=0;linha<2; linha++) 
				{
					for (int coluna = 0; coluna<2; coluna++) 
					{
						matriz1[linha][coluna]+=VALOR;
						matriz2[linha][coluna]+=VALOR;
					}
				}
			}
			break;
			
			case '4':
			{
				
				System.out.println("Matriz M1");
				for(int linha=0; linha<2; linha++)
				{
					for(int coluna=0; coluna<2; coluna++)
					{
						System.out.printf("%.0f \t" , matriz1[linha][coluna]);
					}
					System.out.println();
				}
				
				System.out.println("MATRIZ 2");
				for (int linha=0;linha<2; linha++) 
				{
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",matriz2[linha][coluna]);
					}
					System.out.println();
				}
				
				System.out.println("MATRIZ SOMA");
				for (int linha=0;linha<2; linha++) 
				{
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",matrizSoma[linha][coluna]);
					}
					System.out.println();
				}
				
				System.out.println("MATRIZ SUBTRAI");
				for (int linha=0;linha<2; linha++) 
				{
					for (int coluna = 0; coluna<2; coluna++) 
					{
						System.out.printf("%.0f\t",matrizSubtrair[linha][coluna]);
					}
					System.out.println();
				}
				
				
			}
			break;

			default:
			break;
		
			}

		}while(op != '4');
	}
}
