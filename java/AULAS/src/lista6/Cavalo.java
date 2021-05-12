package lista6;

public final class Cavalo extends Animal
{
	//atributos
	
		
	//construtores
	public Cavalo(String nome, int idade)
	{
		super(nome, idade);

	}
		
	//encapsulamento
	
	//iiirrrrí
	@Override
		public void emiteSom()
		{
			System.out.println("Fazendo som..."+ super.getSom());
		}
	
		
}
