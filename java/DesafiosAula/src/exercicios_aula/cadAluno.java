package exercicios_aula;

import java.util.Scanner;

public class cadAluno 
{
	public static void main (String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		String nome=""; //objeto do tipo string
		int anoNascimento=0;
		char tipo=' ';
		double salario=0.00;
		boolean vivo = true;
		
		//entradas
		System.out.println("Informe o nome: ");
		nome = leia.nextLine().toUpperCase();
		// toUpperCase() coloca as letras em maiusculo
		
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.println("Informe M-masculino, F-feminino, O-outro:  ");
		tipo = leia.next().toUpperCase().charAt(0);
		//ler como string, colocar em maiusculo, e definir como caracter
		
		System.out.println("Informe o seu salario: ");
		salario = leia.nextDouble();
		
		//processamento
		//saidas
		
		//%s = string 
		//%d = int
		//%f ou %.2f= double
		//%c = char
		System.out.printf("Nome: "+nome);
		
		System.out.printf("Nome: %s, idade: %d, tipo: %c, salario: %.4f", nome, (2021-anoNascimento)=idade, tipo, salario);
		
	}


}
