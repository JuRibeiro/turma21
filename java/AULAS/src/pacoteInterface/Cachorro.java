package pacoteInterface;

public class Cachorro extends Mamifero implements Pet, Civilizado
{
	//mamifero
	@Override
	public void mamar()
	{
		System.out.println("Mamando");
	}
	
	//interface pet e civilizado
	@Override
	public void veterinario() 
	{
		// TODO Auto-generated method stub
		System.out.println("Tratar");
		
	}

	@Override
	public void treinar() 
	{
		// TODO Auto-generated method stub
		System.out.println("Pular,correr");
		
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		System.out.println("Jogar bolinha");
		
	}

	@Override
	public void passear() 
	{
		// TODO Auto-generated method stub
		System.out.println("Caminhar na rua");
		
	}

}
