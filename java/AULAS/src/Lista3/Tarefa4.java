package Lista3;

import java.util.Scanner;

public class Tarefa4 
{
	/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas; ok 
 o número de mulheres nervosas; OK
 o número de homens agressivos; ok
 o número de outros calmos; ok
 o número de pessoas nervosas com mais de 40 anos; ok
 o número de pessoas calmas com menos de 18 anos.
	 */
	public static void main (String args[])
	{
	
		Scanner ler = new Scanner (System.in);
		
		int idade;
		char sexo = ' ';
		int opcao, totalCalmos=0, outrosCalmos=0, totalHomemAgressivo=0;
		int totalMulheresNervosas=0, pessoasNervosas=0, pessoasCalmas=0;
		final int pessoas = 3;
		int x=0; 
		
		
		while (x < pessoas )
		{
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Informe o sexo: M-masculino, F-feminino,, O-outre");
			sexo = ler.next().toUpperCase().charAt(0);
			
			System.out.println("Voce se classifica uma pessoa: 1-calma, 2-nervosa, 3-agressiva");
			opcao = ler.nextInt();
			
			x++;
			
			if (opcao==1)
			{
				totalCalmos++;
				
				if(sexo== 'O' )
				{
					outrosCalmos++;
				}
			}
			
			else if (opcao==3 && sexo == 'M')
			{
				totalHomemAgressivo++;
			}
			
			else if(sexo=='F' && opcao==2)
			{
				totalMulheresNervosas++;
			}
			
			else if (opcao==2 && idade>=40)
			{
				pessoasNervosas++;
			}
			
			else if(opcao==1 && idade<=18)
			{
				pessoasCalmas++;
			}
		}
		
		System.out.println("\nRESULTADO DA PESQUISA\n");
		
		System.out.println("Número de pessoas calmas: "+totalCalmos);
		System.out.println("Número de mulheres nervosas: "+totalMulheresNervosas);
		System.out.println("Número de homens agressivos: "+totalHomemAgressivo);
		System.out.println("Número de outros calmos: "+outrosCalmos);
		System.out.println("Número pessoas nervosas com mais de 40 anos: "+pessoasNervosas);
		System.out.println("Número pessoas calmas com menos de 18 anos: "+pessoasCalmas);
		
		ler.close();
		
	
	}
	

}
