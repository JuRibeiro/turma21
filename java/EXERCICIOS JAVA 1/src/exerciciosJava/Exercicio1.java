package exerciciosJava;

import java.util.Scanner;

public class Exercicio1 
{
	/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, 
	 * meses e dias e mostre-a expressa apenas em dias. 
	 */
	public static void main (String args[])
	{
		int idade, dias, meses, totalDias;
		
		//instanciar = criar um teclado 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe sua idade expressa em anos:");
		idade = leia.nextInt();
		
		System.out.println("Voce esta com "+ idade+ " e quantos meses?:");
		meses = leia.nextInt();
		
		System.out.println("Voce esta com "+ idade+ " e quantos dias?:");
		dias = leia.nextInt();
		
		totalDias = (idade*365) + (meses*31) + dias;
		
		System.out.println("\nSua idade expressa em dias � de "+ totalDias+ " dias");
		
		leia.close();
	}

}
