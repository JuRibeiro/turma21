package programas;

import java.util.Scanner;

public class TesteErro 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		int valor=0;
		String nomes[]= new String [3];
		
		try
		{
			System.out.println("Numero da posição [1 a 3] para cadastrar o nome: ");
			valor = leia.nextInt();
			System.out.println("Nome da pessoa a ser cadastrada: ");
			nomes[valor]= leia.next().toUpperCase();
			System.out.println(nomes[valor]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException erro)  //tratamento de erro, exception
		{
			System.out.println("Voce colocou um tamanho de vetor maior q o esperado");
		}
		finally
		{
			System.out.println("Volte sempre");
		}
		
		
		System.out.println("Fim");
		
		leia.close();
	}

}
