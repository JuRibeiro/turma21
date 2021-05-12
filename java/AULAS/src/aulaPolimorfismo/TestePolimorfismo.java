package aulaPolimorfismo;

public class TestePolimorfismo 
{
	public static void main(String[] args) 
	{
		PessoaFisica fisica = new PessoaFisica();
		
		fisica.setNome(" Juliana");
		fisica.setCpf(1234567890l);  //long sem pontos ou tra�os
		
		PessoaJuridica juridica = new PessoaJuridica();
		
		juridica.setNome(" Cristiano");
		juridica.setCnpj(12332145766l);
		
		Pessoa1[] pessoas = new Pessoa1[2];  //vetor indica duas posi��es PJ e PF
		
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for (Pessoa1 pessoa:pessoas)    //pessoa : indica -passar por todas as posi��es de vetores
		{
			System.out.println(pessoa.getNome());
		}
	}

}
