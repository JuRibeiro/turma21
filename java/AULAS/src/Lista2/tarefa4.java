package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class tarefa4 
{
	/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
	
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
	
			System.out.printf("A raiz quadrada dele � :" + Math.sqrt(numero));
		}	
		else
		{
			System.out.println("\nO numero "+numero+" � impar");
			
			System.out.printf("\nO numero escolhido elevado ao quadrado � :" + Math.pow(numero, 2));
		}
		
	    leia.close();
	}

}
