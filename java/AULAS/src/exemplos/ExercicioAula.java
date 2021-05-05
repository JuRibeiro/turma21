package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAula {
	/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. .*/
		
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
			
		    
			/*if (numero==0)
			{
				System.out.println("\nO numero "+numero+ " é neutro");
			}
			else if((numero%2)==0)
			{
				System.out.println("\nO numero "+numero+ " é par");
		
				System.out.printf("A raiz quadrada dele é :" + Math.sqrt(numero));
			}	
			else
			{
				System.out.println("\nO numero "+numero+" é impar");
				
				System.out.printf("\nO numero escolhido elevado ao quadrado é :" + Math.pow(numero, 2));
			}*/
			   
			//((numero%2)==0 )? "Numero par": "Numero impar";
			
			//tenario (simplifica tudo isso de ifs acima)
			System.out.println(((numero%2)==0 )? "Numero par": "Numero impar");
			
			//um tenario dentro de outro
			System.out.println((numero==0)? "Zero é neutro":((numero%2)==0 )? "Numero par": "Numero impar");
			
		    leia.close();
		}

	}
