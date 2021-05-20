package pacoteInterface;

public abstract class Ave extends Animal implements Pet
{
	//na classe abstrata n ´´e necessário trazer os iplements de pet
	@Override
	public void emiteSom()
	{
		
	}
	
	public abstract void voar();
	
	
}
