package Lista2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) 
	{
		
		//2- Faça um programa que entre com três números e coloque em ordem crescente.
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		
		//variaveis
		int Quantidade = 3; //Este valor é igual a quantidade de números para adicionar ao array.
        int[] Numeros = new int[Quantidade]; //Inicia os valores com a mesma quantidade de valores da variável "Quantidade"

      	System.out.print("Ordenador de números\n\n");

        for (int x = 0; x < Quantidade; x++) {
          System.out.print("Digite o "+(x+1)+" número:  ");
          Numeros[x] = entrada.nextInt();
        }

        Arrays.sort(Numeros); //Usando o método de arrays para organizar automaticamente os arrays para mim

        System.out.println("\n\nOs números em ordem crescente são:");
        for (int Numero : Numeros) {
          System.out.println(Numero);
        }
     entrada.close();

	}

}
