package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAula {
	/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. .*/
		
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
			
		    
			/*if (numero==0)
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
			}*/
			   
			//((numero%2)==0 )? "Numero par": "Numero impar";
			
			//tenario (simplifica tudo isso de ifs acima)
			System.out.println(((numero%2)==0 )? "Numero par": "Numero impar");
			
			//um tenario dentro de outro
			System.out.println((numero==0)? "Zero � neutro":((numero%2)==0 )? "Numero par": "Numero impar");
			
		    leia.close();
		}

	}
