package lista6;

public class Caseiro extends Cachorro
{
	//atributos
	private String porte;
	private char pelagem; //muito pelo, pouco pelo
	
	//construtores
	public Caseiro(String nome, int idade, String porte, char pelagem) 
	{
		super(nome, idade);
		this.porte = porte;
		this.pelagem = pelagem;
	}
	
	
}
