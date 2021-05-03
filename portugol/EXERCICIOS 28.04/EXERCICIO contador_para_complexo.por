programa
{
	
	funcao inicio()
	{
		inteiro pesoFixo=0
		inteiro resultado=0
		real mediaPeso=0.00
		inteiro maior=0
		inteiro menor10 = 0

		para (inteiro y = 1; y<=5; y++)
		{
			escreva ("digite o peso -valor inteiro- : ")
			leia (pesoFixo)
			resultado = resultado + pesoFixo//totalização
			se (pesoFixo > maior)
			{
				maior = pesoFixo
			}
			 se(pesoFixo <10)
			{
                menor10++ //contador 
           	}
		}
		mediaPeso = resultado/5
		
		escreva ("Peso3 total = ", resultado, "\n")
		escreva ("A media do peso é: ", mediaPeso, "\n")
		escreva ("O maior peso digitado foi: ", maior, "\n")
		escreva("Qtde de peso[s] menor[es] que 10 : ",menor10)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */