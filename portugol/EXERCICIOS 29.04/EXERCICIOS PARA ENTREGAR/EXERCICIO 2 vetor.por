programa
{
	
	funcao inicio()
	{
		/*
		 * 2 - Um dado é lançado 10 vezes e o valor correspondente 
		 * é anotado. Faça um programa que gere um vetor com os 
		 * lançamentos, escreva esse vetor. A seguir determine e 
		 * imprima a média aritmética dos lançamentos ok
		 * contabilize 
		 * e apresente também quantas foram as ocorrências da maior pontuação ok ?
		 */
		//variaveis
		inteiro lancamentos = 10
		inteiro pontos [10]
		real media=0.00
		inteiro MaiorPontuacao=0, pontuacao=0, qtdVezesMaiorPontuacao=0, acumulador=0

		//entrada
		para (inteiro x=0; x<10; x++)
		{
			escreva ("Lance o dado e anote o valor: ")
			leia (pontos[x])

			media = media + pontos[x]

			se (pontos[x] >= MaiorPontuacao)
			{
				MaiorPontuacao =  pontos[x]
			}

		
		}

		para (inteiro x=0; x<10; x++)
			{
				se (pontos[x] == MaiorPontuacao)
				{
					qtdVezesMaiorPontuacao++
				}
			}

		//processamento
			media = media / lancamentos

			escreva ("\n---Informações referente aos lançamentos---\n")
			escreva ("\nA media dos lançamentos efetuados é de: ", media, " ponto(s)")
			escreva ("\nA maior pontuação foi de: ", MaiorPontuacao, " ponto(s)6")
			escreva ("\nO maior numero foi lançado: ", qtdVezesMaiorPontuacao, " vez(es)")
			
		//saida
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 744; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */