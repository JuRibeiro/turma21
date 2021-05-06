package Lista3;

import java.util.Scanner;

public class Tarefa6 
{
	/*
	 * 6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
	 */
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int num, somaMultiplo3=0, qntNumeros=0;
		double media=0.00;
		
		do
		{
			System.out.println("Informe um valor inteiro e positivo: ");
			num = ler.nextInt();
			
			
			if (num != 0 && num%3==0)
			{
				qntNumeros++; //totalizador
				somaMultiplo3 = somaMultiplo3 + num;
			}
			
			
		}
		while(num != 0);
		
		media = somaMultiplo3 / qntNumeros;
		
		System.out.println("A média dos numero informados e multiplos de 3 é de: " + media);
		
		ler.close();
		
	}

}
