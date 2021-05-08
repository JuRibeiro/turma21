package sintaxeBasica;

public class TestandoLacos2 
{
	public static void main(String[] args) 
	{
		for (int linha = 1; linha<10; linha++)
		{
			for(int coluna=0; coluna <10; coluna++)
			{
				if (coluna > linha )
				{
					break; //sai do laço interno
				}
				System.out.print("*");
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
