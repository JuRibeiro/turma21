package sintaxeBasica;

public class TestandoEscopoDeVariavel 
{
	public static void main(String[] args) 
	{
		System.out.println("Testando Condicionais");
		
		int idade = 20;
		int quantidadePessoas=2;
		boolean acompanhado;
		
		if(quantidadePessoas>=2)
		{
			acompanhado = true; //nasce e morre dentro das chaves se declarado apenas dentro do if
		}
		else 
		{
			acompanhado = false; //nasce e morre dentro das chaves se declarado apenas dentro do if
		} 
		
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
