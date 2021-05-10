package programacaoOrientadaAObjetos;

public class TesteCarro 
{
	public static void main (String args[])
	{
		Carro meuCarro = new Carro ();
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Jeep";
		meuCarro.velociodadeAtual= 0;
		meuCarro.velocidadeMaxima =80;
		
		meuCarro.liga();
		meuCarro.acelera(20);
		System.out.println(meuCarro.velociodadeAtual);
		meuCarro.pegaMarcha();
	}

}
