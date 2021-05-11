package programacaoOrientadaAObjetos;

public class Pessoa2 
{
	//atributos
	private String nome;
	private int matricula;
	
	//construtores (mesmo nome da classe)
	public Pessoa2 (String nome, int matricula)
	{
		this.nome = nome;
		this.matricula = matricula;
		
	}
	
	//encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
