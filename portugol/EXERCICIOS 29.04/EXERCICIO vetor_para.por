programa
{
	
	funcao inicio()
	{
		//variaveis
		cadeia alunes[3]
		real notas [3]
		cadeia mensagem
		inteiro numero=0
		//entradas

		para (inteiro x=0; x<3; x++)
		{
			escreva("Digite o nome do Alune: ")
			leia (alunes[x])

			escreva("Digite a nota: ")
			leia (notas[x])
		}

		escreva ("Informe um numero de 0 a 2: ")
		leia (numero)
		//processamento 
		se (notas[numero]<=5)
		{
			mensagem= ("estude um pouco mais")
		}
		senao
		{
			mensagem = ("continue assim!")
		}
		//saida
		escreva (alunes[numero], " sua nota é: ", notas[numero]," ", mensagem)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */