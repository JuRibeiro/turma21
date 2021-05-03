programa
{
	
	funcao inicio()
	{
		//nome-objetivo
		//inicio
		/*
		 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica 
		 * com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
		 * Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
		 */
			//variaveis
		inteiro custoTotal, custoFabrica, custoDistribuidor, imposto
			//entradas
		escreva ("Informe o custo de fabrica de um carro:")
		leia (custoFabrica)
			//processamentos - modo de preparo
		imposto = (45 * custoFabrica) / 100
		custoDistribuidor = (28 * custoFabrica) / 100
		custoTotal = custoFabrica + custoDistribuidor + imposto
		
			//saidas
		escreva ("O valor total do carro é de:", +custoTotal, "reais ")
		
		//fim
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */