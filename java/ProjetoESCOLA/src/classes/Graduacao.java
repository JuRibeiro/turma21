package classes;

public class Graduacao extends Estudante
{
	//atributos
	private double bonus = 2.00;

	//construtores
	public Graduacao(int matricula, String cpf) 
	{
		super(matricula, cpf);
	}

	//encapsulamento
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void tirarNota (double pontos)
	{
		double aux =0;
		
		if(super.getPontos()>= pontos)
		{
			super.tirarNota(pontos);
		}
		
		
		else if((super.getPontos()+bonus) >= pontos)
		{
			aux = pontos - super.getPontos();
			bonus = bonus - aux;
			super.adicionarNota(aux);
			super.tirarNota(pontos);
		}
		
		else
		{
			System.out.println("Impossivel realizar essa operação");
		}
	
	}
	
}
