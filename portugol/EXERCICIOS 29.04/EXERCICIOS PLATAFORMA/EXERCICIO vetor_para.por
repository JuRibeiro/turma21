programa
{
	
	funcao inicio()
	{
		inteiro numero [4] //vetor - unica dimensao
		inteiro x

		para (x=0; x<4; x++)
		{
			escreva ("Informe um numero: ")
			leia(numero[x])
		}

		escreva ("\nSeguindo a ordem digitada (do primeiro ao quarto): \n")
		
		para (x=0; x<4; x++)
		{
			escreva ("Posições: ", x+1, " - ", numero[x], "\n")
		}

		escreva ("\nAgora em ordem decrescente: \n")
		
		para (x=3; x>=0; x--)
		{
			escreva ("Posições: ", x+1, " - ", numero[x], "\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */