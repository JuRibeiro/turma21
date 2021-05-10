package cadastroCliente;

import java.util.Scanner;

public class DadosCliente {

	public static void main(String[] args) 
	{ //rever este código
		Scanner leia = new Scanner(System.in);
		
		ClassePessoa cliente = new ClassePessoa();
		int respostaVivo;
		
		System.out.println("Digite o seu nome:");
		cliente.nome=leia.next();
		
		System.out.println("Digite o seu ano de nascimento:");
		cliente.anonascimento = leia.nextInt();
		
		System.out.println("Digite o seu genero(M/F/O)");
		cliente.gênero=leia.next().toUpperCase().charAt(0);
		
		System.out.println("Você está vivo ou morto?(1- vivo/2 - morto)");
		respostaVivo=leia.nextInt();
		
		System.out.println("\n ----Apresentando os dados do cliente---- \n");
		System.out.printf("Nome cliente: "+ cliente.nome);
		System.out.printf("\nIdade do cliente: ");
		cliente.idade();
		System.out.println("Genero: "+ cliente.gênero);
		System.out.printf("Declaração de vivo ou morto: ");
		
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
