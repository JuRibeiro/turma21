package pacoteInterface;

public abstract class Mamifero extends Animal
{
	@Override
	public void emiteSom()
	{
		System.out.println("fazer som");
	}
	
	//metodo abstrato
	public abstract void mamar();
}
