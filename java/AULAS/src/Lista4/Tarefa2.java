package Lista4;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre: ok
• Os números pares digitados; ok
• A soma dos números pares digitados; ok
• Os números ímpares digitados; ok
• A quantidade de números ímpares digitados.
		 */
		Scanner leia = new Scanner (System.in);
		
		int [] numeros = new int [5];
		int somaNumPares=0, qtdNumImpares=1;
		int [] par = new int [5];
		int [] impar = new int [5];
		
		for (int i=0; i<5; i++)
		{
			System.out.println("Informe um numero inteiro e positivo: ");
			numeros[i] = leia.nextInt();
			
			if((numeros[i]%2)==0)
			{
				somaNumPares = somaNumPares + numeros[i]; //soma dos valores
				par[i] = (numeros[i]);
			}
			
			if((numeros[i]%2)==1)
			{
				impar[i] = (numeros[i]);
				qtdNumImpares++;
			}
		}
		
		System.out.println("\nA Soma dos numeros pares informados é: "+somaNumPares);
		
		System.out.println("\nOs numeros pares informados foram: ");
		for (int i : par)
		{
			if ( i != 0)
			{
				System.out.println(i);	
			}
		}
		
		System.out.println("\nOs numeros impares informados foram: ");
		for (int i : impar)
		{
			if ( i != 0)
			{
				System.out.println(i);
			}
		}

	}

}
