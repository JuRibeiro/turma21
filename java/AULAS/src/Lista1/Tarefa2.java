package Lista1;

import java.util.Scanner;

public class Tarefa2 
{
	/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma 
	 * f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	 */
	static public void main (String args[])
	{
		//variaveis
		int tempoDuracao, horas, minutos, segundos;
		
		//criar o teclado
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o tempo de dura��o do evento em segundos:");
		tempoDuracao = leia.nextInt();
		
		//processamento
		horas = (tempoDuracao / 3600);
		minutos = (tempoDuracao % 3600) / 60;
		segundos = (tempoDuracao % 3600) % 60; 
		
		//saida de dados
		System.out.println("O tempo de dura��o do evento em horas � de: "+ horas+ " h");
		System.out.println("O tempo de dura��o do evento em minutos � de: "+ minutos+ " m");
		System.out.println("O tempo de dura��o do evento em segundos � de: "+ segundos+ " s");
		
		leia.close();
	}
}
