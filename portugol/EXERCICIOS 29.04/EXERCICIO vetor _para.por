programa
{
	//
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
	//de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	funcao inicio()
	{
	
		real pontuacao [5]
		real maior=0.00, media=0.00, soma=0.00
		
		para(inteiro x=0;x<5;x++)
		{
			escreva("Digite a pontuação: ")
			leia(pontuacao [x])

			soma = soma + pontuacao [x]
		
		}

		media = soma / 5

		para (inteiro x=0;x<5;x++)
		{
			se(maior <= pontuacao[x] )
			{
				 maior = pontuacao[x]
			}
		}

		//processamento
		escreva ("A maior pontuação é de: ",maior, " pontos") 
		escreva ("\nA media de todos os lançamentos é de: ", media, " pontos")

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 204; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */