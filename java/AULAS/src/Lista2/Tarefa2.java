package Lista2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) 
	{
		
		//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		
		//variaveis
		int Quantidade = 3; //Este valor � igual a quantidade de n�meros para adicionar ao array.
        int[] Numeros = new int[Quantidade]; //Inicia os valores com a mesma quantidade de valores da vari�vel "Quantidade"

      	System.out.print("Ordenador de n�meros\n\n");

        for (int x = 0; x < Quantidade; x++) {
          System.out.print("Digite o "+(x+1)+" n�mero:  ");
          Numeros[x] = entrada.nextInt();
        }

        Arrays.sort(Numeros); //Usando o m�todo de arrays para organizar automaticamente os arrays para mim

        System.out.println("\n\nOs n�meros em ordem crescente s�o:");
        for (int Numero : Numeros) {
          System.out.println(Numero);
        }
     entrada.close();

	}

}
