package sintaxeBasica;

public class TestandoCondicional2 
{
	public static void main(String[] args) 
	{
		System.out.println("Testando Condicionais");
		
		int idade = 20;
		int quantidadePessoas=2;
		boolean acompanhado = quantidadePessoas>=2;
		
		System.out.println("\nValor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado)
		{
			System.out.println("\nSeja bem vindo");
		}
	
		else
		{
			System.out.println("\nVoce tem menos de 18 anos, não pode entrar");
		}
		
		
	}
}


