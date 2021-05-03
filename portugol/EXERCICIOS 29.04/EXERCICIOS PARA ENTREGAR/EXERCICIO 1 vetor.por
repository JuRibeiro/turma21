programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que crie um vetor por leitura com 5 
		 * valores de pontuação de uma atividade e o escreva em 
		 * seguida. Encontre após a maior pontuação e a apresente. 
		 */

		 inteiro pontos[5]
		 inteiro maiorPontuacao=0

		 para (inteiro x=0; x<5; x++)
		 {
		 	escreva ("Digite sua pontuação nas atividades: ")
		 	leia (pontos[x])

		 	se (maiorPontuacao < pontos[x])
		 	{
		 		maiorPontuacao = pontos[x]
		 	}
		 	
		 }

		 escreva ("\nA maior pontuação de suas atividades é: ", maiorPontuacao)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 418; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */