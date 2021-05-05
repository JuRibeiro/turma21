package Lista1;

import java.util.Scanner;

public class Tarefa2 
{
	/*3. Faça um sistema que leia o tempo de duração de um evento em uma 
	 * fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	 */
	static public void main (String args[])
	{
		//variaveis
		int tempoDuracao, horas, minutos, segundos;
		
		//criar o teclado
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o tempo de duração do evento em segundos:");
		tempoDuracao = leia.nextInt();
		
		//processamento
		horas = (tempoDuracao / 3600);
		minutos = (tempoDuracao % 3600) / 60;
		segundos = (tempoDuracao % 3600) % 60; 
		
		//saida de dados
		System.out.println("O tempo de duração do evento em horas é de: "+ horas+ " h");
		System.out.println("O tempo de duração do evento em minutos é de: "+ minutos+ " m");
		System.out.println("O tempo de duração do evento em segundos é de: "+ segundos+ " s");
		
		leia.close();
	}
}
