package programacaoOrientadaAObjetos;

public class Carro 
{
	//atributos
	String cor;
	String modelo;
	double velociodadeAtual;
	double velocidadeMaxima;
	
	//metodos
	void liga()
	{
		System.out.println("o carro esta ligado");
	}
	
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velociodadeAtual+ quantidade; 
		this.velociodadeAtual = velocidadeNova;
	}
	
	int pegaMarcha()
	{
		if(this.velociodadeAtual<0)
		{
			return -1;
		}
		
		if (this.velociodadeAtual>=0 && this.velociodadeAtual<40)
		{
			return 1;
		}
		
		if (this.velociodadeAtual>=40 && this.velociodadeAtual<80)
		{
			return 2;
		}
		
		return 3;
	}
}
