package lista6;

public abstract class Animal 
{
	//abstract : n�o pode criar no programa principal outro animal
	//atributos
	private String nome;
	private int idade;
	
	//construtor
	public Animal (String nome, int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}

	//encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	//metodos
	public void som()
	{
		System.out.println("Fazendo som...");
	}
	
}
