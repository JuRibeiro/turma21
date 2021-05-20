package revisao;

public class TrianguloRetangulo extends Triangulo implements AreaPerimetro
{
	private int altura;
	private int base;
	
	//encapsulamento
	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}

	//construtor
	public TrianguloRetangulo(double ladoA, double ladoB, double ladoC, int altura, int base) 
	{
		super(ladoA, ladoB, ladoC);
		this.altura = altura;
		this.base = base;
	}


	@Override
	public double area() 
	{
		int area = altura * base;
		return area;
	}


	@Override
	public double perimetro() 
	{
		double perimetro = (super.getLadoA() + super.getLadoB() + super.getLadoC());
		return perimetro;
	}
	

	
}
