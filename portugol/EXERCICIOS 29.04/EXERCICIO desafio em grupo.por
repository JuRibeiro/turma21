programa
{
	
	funcao inicio()
	{
		/*SPFC   SANTOS     PALMEIRAS     CORINTHIANS
* G-GANHOU (3), P-PERDEU(0), OU E-EMPATOU(1)
VETOR TIMES
VETOR PONTOS
3 RODADAS
LISTAGEM NOME DE CADA TIME - PONTOS ATUAIS
		 */
		inteiro pontos [4] 
		cadeia times [] = {"SPFC", "Santos", "Palmeiras", "Corinthians"}
		const inteiro rodadas = 3
		caracter G, P, E, resultado
		inteiro numeroTimes =4

		para (inteiro i=0; i<rodadas; i++)
		   {
			para (inteiro j=0; j<4; j++)
			{
				escreva ("Informe o resultado do time: ", times[j], " na rodada: ", i+1, " ")
				leia (resultado)

				se (resultado == 'G')
				{
					pontos[j] += 3
				}
				senao se (resultado == 'P')
				{
					pontos[j] += 0
				}
				senao
				{
					pontos[j] += 1
				}
				
		     }
		   }

			para (inteiro i=0; i<numeroTimes; i++)
		  		 {
		   			escreva ("A pontuação do time: ", times[i], " é ", pontos[i], "\n")
		   		 }
		   
			
		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 611; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */