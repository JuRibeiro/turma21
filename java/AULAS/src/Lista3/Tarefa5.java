package Lista3;

import java.util.Scanner;

public class Tarefa5 
{

	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int numero =1, soma =0;
		
		do
		{
			System.out.println("Informe um valor ");
			numero = ler.nextInt();
			
			if(numero != 0)
			{
				soma = soma + numero;
			}
		}
		while (numero != 0);
		
		System.out.println("A soma dos valores digitados (exceto o 0) é de " +soma);
		
		ler.close();
		
	}
}
