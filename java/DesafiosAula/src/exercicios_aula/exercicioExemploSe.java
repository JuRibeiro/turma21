package exercicios_aula;

import java.util.Locale;
import java.util.Scanner;

public class exercicioExemploSe 
{
	public static void main (String args[])
	{
		Locale.setDefault(Locale.US);
		//padrao de digitação americano
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int numero;
		
		//entrada
		System.out.print("Informe um numero inteiro e positivo: ");
		numero = leia.nextInt();
		
		//processamento e saida de dados
		if (numero==0)
		{
			System.out.println("\nO numero "+numero+ " é neutro");
		}
		else if((numero%2)==0)
		{
			System.out.println("\nO numero "+numero+ " é par");
		}
		else if (numero<0)
		{
			System.out.println("\nO numero "+ numero+ " é negativo");
		}
		else 
		{
			System.out.println("\nO numero "+numero+" é impar");
		}
		leia.close();
	}


}
