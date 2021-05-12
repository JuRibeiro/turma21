package lista6;

public class Cachorro extends Animal
{
	//atributos
	
	//construtores
	public Cachorro(String nome, int idade)
	{
		super(nome, idade);
	}
	
	//encapsulamento
	
	//métodos, override significa q veio da classe mae
	
	@Override
	public void emiteSom()
	{
		System.out.println("Fazendo som..."+ super.getSom());
	}
	
}
