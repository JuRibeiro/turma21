package programacaoOrientadaAObjetos;

public class Funcionario2 extends Pessoa2
{
	//atributos
	private String departamento;
	
	//construtores
	public Funcionario2 (String nome, int matricula, String departamento)
	{
		super(nome, matricula); //classe principal 
		this.departamento = departamento;
	}
	
	//encapsulamento
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
