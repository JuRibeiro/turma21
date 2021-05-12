package aulaPolimorfismo;

public class PessoaFisica extends Pessoa1
{
	//atributos
	private long cpf;
	
	//encapsulamento
	
	public PessoaFisica()
	{
		
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	//metodo
	public String getNome()
	{
		return "Pessoa Fisica"+super.getNome()+ " - CPF: "+this.getCpf();
	}
}
