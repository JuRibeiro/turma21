package sintaxeBasica;

public class TestandoCaracteres 
{
	public static void main (String args[])
	{
		char letra = 'a';  //unicode
		
		System.out.println(letra);
		
		char valor = 66;   //letra B na tabela asc
		System.out.println(valor);
		
		valor = (char) (valor +1);
		System.out.println(valor);
		
		String palavra = "Juliana";
		System.out.println(palavra);
		
		palavra = palavra +2020;
		System.out.println(palavra);
	}
}
