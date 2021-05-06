package Lista3;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		
		Scanner ler = new Scanner (System.in);
		
		int num, par=0, impar =0, i=0;
		
		for (num=1; num<=10; num++)
		{
			System.out.printf("Infome o " +num+ "º numero ", i);
			num = ler.nextInt();
			
			if((num%2)==0)
			{
				par++;
			}
			else if ((num%2)==1)
			{
				impar++;
			}

		}
		
		System.out.println("\n---- Resultados ----");
		System.out.printf("\nForam informados %d numero(s) par(es)", par);
		System.out.printf("\nForam informados %d numero(s) impar(es)", impar);
	
		ler.close();
		
	}

}
