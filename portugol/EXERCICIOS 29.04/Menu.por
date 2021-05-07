programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		caracter opcao

		faca 
		{
			escreva ("Digite o código da opção: ")
			escreva("\n1-Básico \n2-Médio \n3-Graduação \n4-Pós \n5-Sair ")
			leia(opcao)

			se(opcao == '1')
			{
				limpa()
				escreva ("\nEnsino Básico")
				Util.aguarde(1000)
			}
			
			senao se (opcao == '2')
			{
				limpa()
				escreva ("\nEnsino Médio")
				Util.aguarde(1000)
			}

			senao se (opcao == '3')
			{
				limpa()
				escreva ("\nGraduação")
				Util.aguarde(1000)
			}
			senao se (opcao == '4')
			{
				limpa()
				escreva ("\nPós")
				Util.aguarde(1000)
			}
			
		} enquanto (opcao !='5')
		escreva ("\nFim do Programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */