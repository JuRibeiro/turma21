package exercicios_aula;

import java.util.Locale;
import java.util.Scanner;

public class exercicioExemploSe 
{
	public static void main (String args[])
	{
		Locale.setDefault(Locale.US);
		//padrao de digita��o americano
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int numero;
		
		//entrada
		System.out.print("Informe um numero inteiro e positivo: ");
		numero = leia.nextInt();
		
		//processamento e saida de dados
		if (numero==0)
		{
			System.out.println("\nO numero "+numero+ " � neutro");
		}
		else if((numero%2)==0)
		{
			System.out.println("\nO numero "+numero+ " � par");
		}
		else if (numero<0)
		{
			System.out.println("\nO numero "+ numero+ " � negativo");
		}
		else 
		{
			System.out.println("\nO numero "+numero+" � impar");
		}
		leia.close();
	}


}
