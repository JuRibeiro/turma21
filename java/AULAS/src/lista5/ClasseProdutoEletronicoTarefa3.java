package lista5;

public class ClasseProdutoEletronicoTarefa3 
{
	/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
	
	public String nomeProduto;
	public int anoProduto;
	public String marca;
	public boolean ativo;
	
	//metodos

	public void idadeProduto() 
	{
		System.out.println("Seu produto tem: " + (2021-anoProduto) + " anos");
	}


}
