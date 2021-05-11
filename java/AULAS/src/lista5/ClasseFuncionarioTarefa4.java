package lista5;

public class ClasseFuncionarioTarefa4 
{
	/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
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
