package lista5;

import java.util.Scanner;

public class Tarefa1 
{
	public static void main(String[] args) 
	{ 
		/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console. 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		ClasseClienteTarefa1 cliente = new ClasseClienteTarefa1();
		int respostaVivo;
		
		System.out.println("Digite o seu nome:");
		cliente.nome=leia.next();
		
		System.out.println("Digite o seu ano de nascimento:");
		cliente.anonascimento = leia.nextInt();
		
		System.out.println("Digite o seu genero(M/F/O)");
		cliente.g�nero=leia.next().toUpperCase().charAt(0);
		
		System.out.println("Voc� est� vivo ou morto?(1- vivo/2 - morto)");
		respostaVivo=leia.nextInt();
		
		System.out.println("\n ----Apresentando os dados do cliente---- \n");
		System.out.printf("Nome cliente: "+ cliente.nome);
		System.out.printf("\nIdade do cliente: ");
		cliente.idade();
		System.out.println("Genero: "+ cliente.g�nero);
		System.out.printf("Declara��o de vivo ou morto: ");
		
		if(respostaVivo == 1)
		{
			System.out.println("O cliente esta vivo");
		}
		else if (respostaVivo == 2)
		{
			System.out.println("O cliente esta morto");
		}
		
		leia.close();
	}

}
