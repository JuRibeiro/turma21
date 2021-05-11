package programacaoOrientadaAObjetos;

public class Coordenador2 extends Pessoa2
{
	//atributo
	private String cursoCoordenado;
	
	//construtor
	public Coordenador2 (String nome, int matricula, String cursoCoordenado)
	{
		super(nome, matricula);
		this.cursoCoordenado = cursoCoordenado;
	}

	//encapsulamento
	public String getCursoCoordenado() 
	{
		return cursoCoordenado;
	}

	public void setCursoCoordenado(String cursoCoordenado) 
	{
		this.cursoCoordenado = cursoCoordenado;
	}
	
	
}
