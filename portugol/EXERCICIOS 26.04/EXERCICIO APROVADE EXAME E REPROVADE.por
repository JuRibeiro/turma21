programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//laço condicional
		// teste de condições
		cadeia nome 
		real n1,n2,n3,media

		escreva ("Qual é o seu nome?: ")
		leia (nome)

		escreva ("Informe a primeira nota: ")
		leia (n1)

		escreva ("Informe a segunda nota: ")
		leia (n2)

		escreva ("Informe a terceira nota: ")
		leia (n3)

		media = (n1+n2+n3)/3
		limpa()

		se (media >=7.0)
		{
			escreva (nome," voce esta aprovade, com nota ",mat.arredondar(media,2) )
		}
		senao se (media>=4 e media<7)
		{
			escreva (nome, " voce esta de exame, com nota ", mat.arredondar(media,2))
		}
		senao 
		{
			escreva (nome, " voce foi reprovade, com nota ", mat.arredondar(media,2))
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */