programa
{
	
	funcao inicio()
	{
		cadeia irmaos [2] [2]

		irmaos [0][1] = "Ednilson"
		irmaos [1][1] = "Evandro"
		irmaos [0][0] = "Eduardo"
		irmaos [1][0] = "Everton"

		para (inteiro linha=0; linha<2; linha ++)
		{
			para(inteiro coluna=0; coluna<2; coluna++)
			{
				escreva (irmaos[linha][coluna], "\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */