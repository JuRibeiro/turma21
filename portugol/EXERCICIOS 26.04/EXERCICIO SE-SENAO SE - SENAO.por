programa
{
	
	funcao inicio()
	{
		//ler um numero inteiro positivo
		// e dizer se é par ou impar

		inteiro numero 

		escreva("digite um numero inteiro: ")
		leia (numero)

		se (numero==0)
		{
			escreva ("O número é ZERO, zero é neutro")
		}
		
		senao se ((numero%2)==0)
		{
			escreva ("O número é par")
		}

		senao
		{
			escreva ("O numero é impar\n")
		}

		escreva ("\n")
		escreva ("fim do programa \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */