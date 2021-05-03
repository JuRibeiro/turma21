programa
{
	
	funcao inicio()
	{
		
		//refatoramento de codigo
		//resolve o mesmo problema
		//d forma otimizada
		inteiro contador=1
		inteiro vezes

		escreva ("Quantas vezes voce deseja repetir a frase?: ")
		leia (vezes)


		para (contador = 1; contador<=vezes; contador++) //x+=2 incremento de 2
		{
			se ((contador%2)==0)
			{
				escreva (contador," Hello World \n")
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */