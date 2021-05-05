package exemplos;

import java.util.Scanner;

public class Condicional1 
{
	//src source = fonte 
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("Informe sua idade:");
		idade = ler.nextInt();
		
		ler.nextLine(); //limpar o buffer
		
		System.out.printf("Informe o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("\n---- Dados de registro ----\n");
		System.out.printf("Nome: %s, Idade: %d", nome, idade);
		
		System.out.println("\n\n---- Dados processados ----\n");
		if (idade>=18)
		{
			System.out.printf(nome+ " você é maior de idade "+idade);
		}
		else if (idade>=1 && idade<18)
		{
			System.out.println(nome+" você é menor de idade "+idade);
		}
		else
		{
			System.out.println(nome+"você entrou com uma idade invalida");
		}
		
		ler.close();
	}
	
}
