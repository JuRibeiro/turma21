package pacoteInterface;

public class Papagaio extends Ave implements Pet
{
	@Override
	public void voar()
	{
		System.out.println("Voandooo");
	}

	//metodos de PET
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		System.out.println("Ensinar uma musica");
		
	}

	@Override
	public void passear() {
		// TODO Auto-generated method stub
		System.out.println("Colocando no ombro e indo passear");
		
	}
}
