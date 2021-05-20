package revisao;

public class Circulo implements AreaPerimetro
{
	//atributos
	//pode ser public/private
	private double raio;
	
	//construtores (tem o mesmo nome da classe)
	public Circulo (double raio)
	{
		super();
		this.raio = raio;		
	}
	
	//encapsulamento	
	public double getRaio()
	{
		return raio;
	}
	
	public void setRaio (double raio)
	{
		this.raio = raio;
	}
	
	//metodos

	@Override
	public double area() {
		double area = 3.14 * raio * raio;
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = 2 * 3.14 * raio;
		return perimetro;
	}
	
}
