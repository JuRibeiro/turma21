package aulaPolimorfismo;

public class PessoaJuridica extends Pessoa1
{	
	//atributos
	private long cnpj;	
	
	//encapsulamento

	public PessoaJuridica()
	{
		
	}
	public long getCnpj() 
	{
		return cnpj;
	}

	public void setCnpj(long cnpj) 
	{
		this.cnpj = cnpj;
	}
	
	//metodo
	public String getNome()
	{
		return "Pessoa Juridica"+super.getNome()+ " - CNPJ: "+this.getCnpj();
	}
	
	

}
