package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Estudante;
import classes.Graduacao;

public class ProgramaTeste {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o nome do aluno");
		String nome = leia.next();
		System.out.println("Informe a matricula");
		int matricula = leia.nextInt();
		System.out.println("Informe o CPF");
		String cpf = leia.next();
		System.out.println("dia do niver:");
		int dia = leia.nextInt();
		System.out.println("Nota inicial: ");
		double nota = leia.nextDouble();
		
		Basico aluno1 = new Basico (matricula, cpf, dia); //instanciando o objeto
		Graduacao grad1 = new Graduacao (matricula, cpf);
		
		aluno1.setNome(nome);
		aluno1.adicionarNota(10);
		grad1.adicionarNota(10);
		
		
		/*System.out.println("PONTOS ATUAIS: "+aluno1.getPontos());
		System.out.println("Dia atual");
		int diaAtual = leia.nextInt();
		
		aluno1.bonusAniversario(diaAtual);
		System.out.println("PONTOS após metodo: "+aluno1.getPontos());*/
		
		char op= ' ';
		System.out.println("Nota do Grade 1 "+grad1.getPontos());
		
		for (int x=1; x<=3; x++)
		{
			System.out.println("Informe o valor da sua nota: ");
			nota = leia.nextDouble();
			System.out.println("Digite 1 para adicionar, 2 para tirar");
			op = leia.next().charAt(0);
			if (op == '1')
			{
				grad1.adicionarNota(nota);
			}
			else 
			{
				grad1.tirarNota(nota);
			}
			System.out.println("Novo saldo de notas de grade 1: "+grad1.getPontos());
		}
	}

}
