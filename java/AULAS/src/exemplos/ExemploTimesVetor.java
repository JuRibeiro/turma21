package exemplos;


public class ExemploTimesVetor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String times [] = {"SPFC", "PALMEIRAS", "SANTOS", "CORINTHIANS"};
		
		
		System.out.println("\nexemplo de FOR normal\n");
		for (int x=0; x < times.length; x++)
		{
			System.out.println("O nome do time é: "+times[x]);
			
		}
		System.out.println("\nexemplo de FOR each\n");
		for (String nome : times)  //string nome apelido ':' esses dois pontos significa = vai até times
		{
			System.out.println("O nome do time é: "+nome);
			
		}
	}

}
