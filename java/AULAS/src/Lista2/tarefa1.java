package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class tarefa1 
{
// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main (String args[])
	{
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		//variaveis
		int num1=0, num2=0, num3=0;
		
		//entrada de dados
		System.out.println("Informe o primeiro numero positivo e inteiro: ");
		num1 = ler.nextInt();
		
		System.out.println("Informe o segundp numero positivo e inteiro: ");
		num2 = ler.nextInt();
		
		System.out.println("Informe o terceiro numero positivo e inteiro: ");
		num3 = ler.nextInt();
		
		//processamento e saida 
		if (num1>num2 && num1>num3){
			System.out.printf("O numero maior é: "+num1);
		}
		
		else if (num2>num1 && num2>num3) {
			System.out.println("O numero maior é: "+num2);
		}
		
		else if (num3>num1 && num3>num2) {
			System.out.println("O numero maior é: "+num3);
		}

		ler.close();
		
	}
}
