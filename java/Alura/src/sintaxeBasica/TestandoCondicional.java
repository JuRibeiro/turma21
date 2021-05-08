package sintaxeBasica;

public class TestandoCondicional 
{
	public static void main(String[] args) 
	{
		System.out.println("Testando Condicionais");
		
		int idade = 15;
		int quantidadePessoas=0;
		
		if (idade >= 18 )
		{
			System.out.println("\nVoce tem mais de 18 anos");
		}
		else 
		{
			if(quantidadePessoas >=2)
			{
				System.out.println("\nVoce tem menos de 18 anos");
				System.out.println("Mas pode entrar, pois esta acompanhado");
			}
			else
			{
				System.out.println("\nVoce tem menos de 18 anos, não pode entrar");
			}
		}
	}

}
