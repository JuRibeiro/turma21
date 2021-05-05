package Lista2;

import java.util.Scanner;

public class tarefa3 
{
	public static void main (String args[])
	{
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
		 */
		
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
		
		System.out.println("\n\n---- Categoria ----\n");
		if (idade>=10  && idade<=14)
		{
			System.out.printf("Infantil");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("Juvenil");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("Adulto");
		}
		else 
		{
			System.out.println("Não trabalhamos com esta categoria");
		}
		
		ler.close();
	}

}
