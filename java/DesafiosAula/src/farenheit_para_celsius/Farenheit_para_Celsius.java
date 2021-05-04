package farenheit_para_celsius;

import java.util.Scanner;

public class Farenheit_para_Celsius 
{
	public static void main(String[] args) 
	{
		
		//instanciar = criar teclado 
		Scanner leia = new Scanner(System.in);
		//variaveis 
		double farenheit, grausResultado;
		String nome;
		
		//entrada
		System.out.println("Informe a temperatura da sua cidade em Farenheit");
		farenheit = leia.nextDouble();
		
		System.out.println("Informe seu nome");
		nome = leia.next();
		
		//processamento
		grausResultado = (farenheit - 32) / 1.8;
		
		//saida
		System.out.println(nome+" a conversão do valor da temperatura de Farenheit para Celsius é: "+Math.round(grausResultado)+ "°C");
		// $s ler a string, %.2f ler um numero quebrado apresentado duas casas após a virgula
		System.out.printf("\nNome: %s a temperatura na sua cidade em Celsius é: %.2f°C", nome, grausResultado  );
		
		leia.close();
		
	}
	
}
