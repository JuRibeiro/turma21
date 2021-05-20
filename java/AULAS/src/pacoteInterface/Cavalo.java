package pacoteInterface;

public class Cavalo extends Mamifero implements Civilizado
{
	@Override
	public void mamar()
	{
		System.out.println("Mamando");
	}

	@Override
	public void emiteSom() {
		// TODO Auto-generated method stub
		
	}
	
	//metodo interface civilizado

	@Override
	public void veterinario() 
	{
		// TODO Auto-generated method stub
		System.out.println("Cuidar da pelagem");
		
	}

	@Override
	public void treinar() 
	{
		// TODO Auto-generated method stub
		System.out.println("Correr no Centro hipico");
		
	}
	
	

}
