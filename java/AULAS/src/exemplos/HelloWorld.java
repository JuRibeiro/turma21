package exemplos;

import java.util.Scanner;

public class HelloWorld 
{
	/*publico estatico não-tem-retorno principal */
	public static void main(String[] args)
	{
		//variaveis
		//inteiro numero1 = 10, numero2 
		int numero1 = 10;
		int numero2 = 30; //inteiro
		double salario = 129.00; // real
		char op = 'S';
		String nome;//cadeia
		
		//processamento
		//escreva("ola mundo")
		//comandos com a letra maiuscula são uma classe
		System.out.println("Oi Mundo");
		System.out.println("JULIANA BRITO FAVERO RIBEIRO");
		//println imprime e pula a linha
		System.out.print("JULIANA BRITO FAVERO RIBEIRO \n");
		System.out.println("JULIANA BRITO FAVERO RIBEIRO\n");
		
		System.out.println("Soma: " +(numero1 + numero2));
		
		//instanciar = criar um teclado 
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um numero:");
		//leia (numero1)
		numero1 = leia.nextInt();
		
		System.out.println("Digite outro numero:");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o nome:");
		nome = leia.next();
		
		System.out.println("Digite o salario:");
		salario = leia.nextDouble();
		
		leia.close();
	}
	

}
