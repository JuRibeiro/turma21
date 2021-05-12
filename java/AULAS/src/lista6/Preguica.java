package lista6;

public class Preguica extends Animal
{
	//atributos

	
	//construtores
	public Preguica (String nome, int idade)
	{
		super(nome, idade);
	}
	
	//encapsulamento

	
	@Override
	public void emiteSom()
	{
		System.out.println("Fazendo som..."+ super.getSom());
	}

	
	
}
