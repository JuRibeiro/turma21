package programaPrincipal;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario;
import classes.Terceiro;

public class CadFuncionario 
{
	public static void main (String args[])
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		List<Funcionario> lista = new ArrayList<>();

		//Terceiro terc1 = new Terceiro ("4321", 8, 50, "José", 50);
		
		//String matricula, int horasTrabalhadas, double valorHora, String nome, double adicional
		
		//System.out.printf("\nNome do funcionario Terceiro: %s\n", terc1.getNome());
		//terc1.mostrarSalario();
	
		
	/*	System.out.println("Nome funcionario: ");
		String nome = leia.next().toUpperCase();
		
		System.out.println("Informe a matricula: ");
		String matricula = leia.next().toUpperCase();
		
		System.out.println("Informe as horas trabalhadas");
		int horasTrabalhadas = leia.nextInt();
		
		System.out.println("Informe o valor ganho por hora: R$");
		double valorHora = leia.nextDouble();
		
		Funcionario func1 = new Funcionario (matricula, horasTrabalhadas, valorHora, nome);*/
		
		System.out.println("CADASTRO DE FUNCIONARIOS\n\n");
		System.out.println("Quantidade de funcionarios: ");
		int qtd = leia.nextInt();
		
		for (int x = 1; x<=qtd; x++)
		{
			System.out.println("Digite: 1 Funcionario / 2 Funcionario Terceiro");
			char op = leia.next().charAt(0);
			
			System.out.println("Nome funcionario: ");
			String nome = leia.next().toUpperCase();
			
			System.out.println("Informe a matricula: ");
			String matricula = leia.next().toUpperCase();
			
			System.out.println("Informe as horas trabalhadas");
			int horasTrabalhadas = leia.nextInt();
			
			System.out.println("Informe o valor ganho por hora: R$");
			double valorHora = leia.nextDouble();
			
			if (op == 2)
			{
				System.out.println("Qual o valor do adicional? R$");
				double adicional = leia.nextDouble();
			//	Terceiro t1 = new Terceiro (matricula, horasTrabalhadas, valorHora, nome, adicional); aqui armazena 1 funcionario
				lista.add(new Terceiro (matricula, horasTrabalhadas, valorHora, nome, adicional));   //aqui armazena uma infinidade de informações
			}
			
			else
			{
				lista.add(new Funcionario (matricula, horasTrabalhadas, valorHora, nome)); 
			}
			
		}
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		
		//for each 
		for (Funcionario func : lista)
		{
			System.out.println();
			System.out.println(" Nome do funcionario: ");
			System.out.printf( func.getNome());
			System.out.println();
			func.mostrarSalario();
		}
		
		
		leia.close();
	}

}
