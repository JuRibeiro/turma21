package Lista1;

import java.util.Scanner;

public class Tarefa3 
{
	static public void main (String args[])
	{
		/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
		respectivamente.
		 */
		
		//variaveis 
		double nota1, nota2, nota3, media, mediaTotal;
		
		//instanciar = criar teclado 
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe sua primeira nota:");
		nota1 = leia.nextDouble();
		
		System.out.println("Informe sua segunda nota:");
		nota2 = leia.nextDouble();
		
		System.out.println("Informe sua terceira nota:");
		nota3 = leia.nextDouble();
		
		//processamento
		media = nota1 + nota2 + nota3;
		mediaTotal = media / 3;
		
		//saida de dados
		
		System.out.println("\n--Suas notas e m�dia final--\n");
		System.out.println("Nota 1 - "+ nota1+ "| Nota 2 - "+ nota2+ "| Nota 3 - "+ nota3);		
		System.out.println("\nA sua m�dia final � de: "+ mediaTotal);
		
		leia.close();
	}

}
