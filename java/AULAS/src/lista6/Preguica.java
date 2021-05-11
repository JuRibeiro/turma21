package lista6;

public class Preguica extends Animal
{
	//atributos
	private boolean sobeArvores;
	
	//construtores
	public Preguica (String nome, int idade, boolean emiteSom, boolean sobeArvores)
	{
		super(nome, idade, emiteSom);
		this.sobeArvores = sobeArvores;
	}
	
	//encapsulamento
	public boolean isSobeArvores() {
		return sobeArvores;
	}

	public void setSobeArvores(boolean sobeArvores) {
		this.sobeArvores = sobeArvores;
	}
	
	
}
