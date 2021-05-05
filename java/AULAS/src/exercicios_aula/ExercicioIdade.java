package exercicios_aula;

import java.util.Scanner;

public class ExercicioIdade 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento=0;
		String nome="";
		char genero;
		int idade=0;
		
		System.out.println("Digite o seu nome:");
		nome = leia.next();
		
		System.out.println("Digite o seu ano de nascimento:");
		anoNascimento = leia.nextInt();
		
		System.out.println("Como você identifica: M-masculino; F- Feminino; O-Outro");
		genero= leia.next().charAt(0);
		
		idade=2021-anoNascimento;
		
		System.out.printf("Nome: %s\nIdade: %d\nGenero: %c", nome,idade,genero);
		
		leia.close();
	}
}
