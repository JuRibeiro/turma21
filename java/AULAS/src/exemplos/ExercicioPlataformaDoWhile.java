package exemplos;

import java.util.Scanner;

public class ExercicioPlataformaDoWhile 
{
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int idade =0;
		
		System.out.printf("Informe sua idade: ");
		idade = ler.nextInt();
		
		do
		{
			System.out.printf("Informe sua idade: ");
			idade = ler.nextInt();
			
			System.out.printf("Sua idade: %d ", idade);
			if (idade>=18)
			{
				System.out.printf("Você é maior de idade");
				
			}
			else
			{
				System.out.printf("\nVocê é menor de idade");
			}			
		
		}
		while(idade>=1);
		
		ler.close();

	}
}
