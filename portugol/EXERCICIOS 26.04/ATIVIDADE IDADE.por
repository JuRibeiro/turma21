programa
{
	
	funcao inicio()
	{
		//idade
		//inicio
			//variaveis
			inteiro ano_nascimento
			cadeia nome
			inteiro ano_atual
			inteiro resultado 
			
			//entradas
			escreva ("nome: ")
			leia (nome)
			
			escreva ("ano de nascimento: ")
			leia (ano_nascimento)

			escreva ("ano atual: ")
			leia (ano_atual)
			
			//processamento
			resultado = ano_atual-ano_nascimento
			
			//saidas
			escreva (nome + " a sua idade aproximada é: \n" +resultado)

			escreva (nome + " sua idade aproximada é: " + (2021 - ano_nascimento) + "anos")
		//fim
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 170; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */