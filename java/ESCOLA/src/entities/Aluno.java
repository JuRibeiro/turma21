package entities;

public class Aluno 
{
	//primeiro trabalha a classe e depois o objeto principal
	
	//atributos: tudo que o objeto tem, é ou está
	public int matricula;
	public String cpf;
	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean ativo;
	
	//construtor padrao
	public Aluno()
	{
		
	}
	
	//construtor - tem o mesmo nome da classe
	public Aluno (int matricula, String cpf, String nome) //construtor para programador
	{
		this.matricula = matricula; //this diferencia um atributo de uma variavel
		this.cpf = cpf;
		this.nome = nome;
	}
	
	//metodo de sobrecarga de construtor (tem que ter algo diferente)
	public Aluno (int matricula, String nome)
	{
		this.matricula = matricula; //this diferencia um atributo de uma variavel
		this.nome = nome;
	}
	
	
	//metodos - comportamento: tudo o que o objeto faz verbos/adverbios
	public void mostrarIdade()
	{
		System.out.println("Idade do Aluno: "+ (2021-anoNascimento));
	}
	
	//sobrecarga
	public void mostrarIdade(int anoAtual)
	{
		System.out.println("Idade do Aluno: "+ (anoAtual-anoNascimento));
	}
	
}
