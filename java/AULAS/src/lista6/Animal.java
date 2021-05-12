package lista6;

public abstract class Animal 
{
	//abstract : não pode criar no programa principal outro animal
	//atributos
	private String nome;
	private int idade;
	private String som;
	
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

	public String getSom() 
	{
		return som;
	}

	public void setSom(String som) 
	{
		this.som = som;
	}

	//metodos
	public void emiteSom()
	{
		System.out.println("Fazendo som...");
	}
	
}
