package lista6;

public class Animal 
{
	//atributos
	private String nome;
	private int idade;
	private boolean emiteSom;
	
	//construtor
	public Animal (String nome, int idade, boolean emiteSom)
	{
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
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

	public boolean getEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}

	
}
