package lista5;

public class ClasseFuncionarioTarefa4 
{
	/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/
	
	public String nomeFuncionario;
	public int anoNascimento;
	public char estadoCivil;
	public String cpf;
	
	public void idadeFuncionario()
	{
		System.out.println("Idade do Funcionario: "+ (2021-anoNascimento) + " anos");
	}

}
