package revisao;

public abstract class Triangulo 
{
	//uma classe abstrata n pode ser instanciada
	
	//atributos
	double ladoA;
	double ladoB;
	double ladoC;
	
	//construtores
	public Triangulo(double ladoA, double ladoB, double ladoC) 
	{
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}


	public double getLadoA() {
		return ladoA;
	}


	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}


	public double getLadoB() {
		return ladoB;
	}


	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}


	public double getLadoC() {
		return ladoC;
	}


	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	

}
