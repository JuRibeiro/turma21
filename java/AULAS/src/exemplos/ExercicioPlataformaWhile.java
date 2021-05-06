package exemplos;


import java.util.Scanner;

public class ExercicioPlataformaWhile {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		// TODO Auto-generated method stub
		int idade;
		
		System.out.printf("Informe sua idade: ");
		idade = ler.nextInt();
		
		while(idade>=1)
		{
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

	}

}
