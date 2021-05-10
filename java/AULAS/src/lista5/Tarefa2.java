package lista5;

import java.util.Scanner;

public class Tarefa2 
{
	public static void main (String args[])
	{
		
		/*
		 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
		 */
		
		//instanciando teclado e classe
		Scanner leia = new Scanner (System.in);
		ClasseAviaoTarefa2 aviao = new ClasseAviaoTarefa2();
		
		//entrada de dados
		System.out.printf("Qual o nome do avião que ira embarcar? ");
		aviao.nomeAviao = leia.next();
		
		System.out.printf("Quantos assentos tem este aviao? ");
		aviao.numeroAssentos = leia.nextInt();
		
		System.out.printf("De que ano é o modelo deste aviao? ");
		aviao.anoModelo = leia.nextInt();
		
		//processamento de dados
		System.out.println("\nDADOS DO AVIÃO DE EMBARQUE\n");
		System.out.println("Nome do aviao: " + aviao.nomeAviao);
		System.out.println("Numero de Assentos: " +aviao.numeroAssentos);
		System.out.println("Ano do modelo deste aviao: " +aviao.anoModelo);
		aviao.idadeAviao();
		System.out.println();
		System.out.println("Tem certeza que quer viajar com ele ??");
		
		leia.close();
	}

}
