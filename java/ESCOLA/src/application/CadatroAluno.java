package application;

import java.util.Scanner;

import entities.Aluno;

public class CadatroAluno {

	public static void main(String[] args)
	{
		//teste de usuário
		//teste de programador
		
		Scanner leia = new Scanner (System.in); //construtor do Scanner
		
		//instanciou o objeto aluno 1 do tipo aluno
		Aluno aluno1 = new Aluno(1,"111.111.111-11", "João");
		Aluno aluno2 = new Aluno(2, "222.222.222-22", "Maria");
		Aluno aluno3 = new Aluno(3, "José");
		
		aluno2.nome = "Maria";
		aluno3.nome = " ";
		
		aluno1.nome  = "João";
		aluno1.anoNascimento = 1980;
		
		System.out.println(aluno1.nome);
		
		aluno1.mostrarIdade();
		aluno1.mostrarIdade(2030);
		
		
		leia.close();
	}

}
