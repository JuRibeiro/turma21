package lista5;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		ClasseFuncionarioTarefa4 classeFunc = new ClasseFuncionarioTarefa4 ();
		char respostaEstadoCivil = ' ';
		
		System.out.printf("Informe o nome do funcionário: ");
		classeFunc.nomeFuncionario = leia.next().toUpperCase();
		
		System.out.printf("informe seu ano de nascimento: ");
		classeFunc.anoNascimento = leia.nextInt();
		
		System.out.printf("Informe seu estado civil: C-casado, S-solteiro, V-viuvo, D-divorciado ");
		respostaEstadoCivil = leia.next().toUpperCase().charAt(0);
		
		System.out.printf("Informe o CPF: ");
		classeFunc.cpf = leia.next();
		
		System.out.println();
		System.out.println("CADASTRO DO FUNCIONÁRIO");
		System.out.println();
		System.out.println("Nome do funcionario: "+ classeFunc.nomeFuncionario);
		classeFunc.idadeFuncionario();
		
		if (respostaEstadoCivil == 'C')
		{
			System.out.printf("Estado civil do funcionario: casado(a)");
		}
		if (respostaEstadoCivil == 'S')
		{
			System.out.printf("Estado civil do funcionario: solteiro(a)");
		}
		if (respostaEstadoCivil == 'V')
		{
			System.out.printf("Estado civil do funcionario: viuvo(a)");
		}
		if (respostaEstadoCivil == 'D')
		{
			System.out.printf("Estado civil do funcionario: divorciado(a)");
		}
		System.out.println("\nCPF funcionario: "+ classeFunc.cpf);
		
		leia.close();

	}

}
