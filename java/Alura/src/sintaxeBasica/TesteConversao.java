package sintaxeBasica;

public class TesteConversao 
{
	public static void main(String args[])
	{
		double salario = 1270.50;
		int valor = (int)salario; //transformou o double em int - casting (conversao double em int)
		
		System.out.println(valor);
		
		//int = 32 bits
		//long = maior que int; 3273342374763l (tem que por um l) long
		//short = 16 bits menor que int
		//byte b = vai até 127;
		//float = ponto flutuante  3.14f (tem que por o f no final)
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1+valor2;
		
		System.out.println(total);
		//resultado extenso
	}

}
