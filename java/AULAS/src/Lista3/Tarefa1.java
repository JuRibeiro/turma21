package Lista3;


public class Tarefa1 
{
	public static void main (String args[])
	{
		/*1- Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/
		
		
		int numero = 1000;
		
		for (numero =1000; numero<=1999; numero++)
		{
			if((numero%11)==5)
			{
				System.out.printf("numero %d / 11 = 5 \n", numero);
			}
		}
		

	}
}
