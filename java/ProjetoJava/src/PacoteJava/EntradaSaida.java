package PacoteJava;

import java.util.Scanner;

public class EntradaSaida 
{
	public static void main (String args[])
	{
		//instanciar = criar
		Scanner ler = new Scanner (System.in);
		int a,b,soma;
		
		System.out.println("Digite um numero para A:");
		a = ler.nextInt();
		
		System.out.println("Digite um numero para B:");
		b = ler.nextInt();
		
		soma = a + b;
		System.out.println("A Soma dos valores é de: "+soma);
		
		ler.close();
	}

}
