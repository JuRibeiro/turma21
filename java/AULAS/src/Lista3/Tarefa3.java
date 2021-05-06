package Lista3;

import java.util.Scanner;

public class Tarefa3 
{
	/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for=99. (WHILE) */
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int idade=0, totalMenos21=0, totalMais50=0;
		
		while (idade < 99)
		{
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
			
			if (idade<=21)
			{
				totalMenos21++;
			}
			else if (idade>=50)
			{
				totalMais50++;
			}
			else
			{
				System.out.println("Essa idade não foi totalizada");
			}
		}
		
		System.out.println("\n--- Resultados ---");
		System.out.printf("\nA quantidade de pessoas com idade menor ou igual a 21 anos é de: %d pessoas ", totalMenos21 );
		System.out.printf("\nA quantidade de pessoas com idade maior ou igual a 50 anos é de: %d pessoas ", totalMais50 );
		
		
		ler.close();
	}
	

}
