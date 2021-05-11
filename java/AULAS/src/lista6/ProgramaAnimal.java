package lista6;

import java.util.Scanner;

public class ProgramaAnimal {

	public static void main(String[] args) 
	{	//rever este codigo
		Animal Cavalo = new Cavalo ("Cavalo",20, true, 'S' );
		Animal Cachorro = new Cachorro ("Cachorro", 5, true, 'S');
		Animal Preguica = new Preguica ("Preguiça", 40, false, true );
		
		System.out.println("ANIMAL 1");
		System.out.printf("Com qual animal iremos trabalhar agora? ");
		System.out.printf(Cavalo.getNome());
		
		System.out.printf("\nQual idade deste animal? ");
		System.out.print(Cavalo.getIdade());
		
		System.out.printf("\nEste animal emite som? ");
		if(Cavalo.getEmiteSom() == true) 
		{
			System.out.printf("Sim, este animal relincha iiirrrrí");
		}
		else
		{
			System.out.printf("Não");
		}
		System.out.println("\n\n");
		System.out.println("ANIMAL 2");
		System.out.printf("Com qual animal iremos trabalhar agora? ");
		System.out.printf(Cachorro.getNome());
		
		System.out.printf("\nQual idade deste animal? ");
		System.out.print(Cachorro.getIdade());
		
		System.out.printf("\nEste animal emite som? ");
		if(Cachorro.getEmiteSom() == true) 
		{
			System.out.printf("Sim, este animal late au au au");
		}
		else
		{
			System.out.printf("Não");
		}
		
		System.out.println("\n\n");
		System.out.println("ANIMAL 3");
		System.out.printf("Com qual animal iremos trabalhar agora? ");
		System.out.println(Preguica.getNome());
		
		System.out.printf("Qual idade deste animal? ");
		System.out.print(Preguica.getIdade());
		
		System.out.printf("\nEste animal emite som? ");
		if(Preguica.getEmiteSom() == true) 
		{
			System.out.printf("Sim");
		}
		else
		{
			System.out.printf("Não");
		}
		
		System.out.printf("\nEste animal sobe em arvores? ");
		/*if()
		{
			System.out.printf("Sim");
		}
		else
		{
			System.out.printf("Não");
		}*/
		
		
		
		
		
	}

}
