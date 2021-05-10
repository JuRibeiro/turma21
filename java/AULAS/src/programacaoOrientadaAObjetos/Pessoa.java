package programacaoOrientadaAObjetos;

public class Pessoa 
{
	//atributos
	private String primeiroNome;
	private String ultimoNome;
	private String nomeDoMeio;
	
	//construtor apenas executa
	public Pessoa (String primeiro, String meio, String ultimo) //parametros do construtor
	{
		primeiroNome=primeiro;
		ultimoNome=ultimo;
		nomeDoMeio=meio;

	}
	
	//metodo
	public String getNomeCompleto()
	{
		String NomeCompleto = primeiroNome+ nomeDoMeio+ ultimoNome;
		return NomeCompleto;
	}
	
}
