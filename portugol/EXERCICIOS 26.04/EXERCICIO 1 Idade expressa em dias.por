programa
{
	
	funcao inicio()
	{
		//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		//dias e mostre-a expressa apenas em dias.

		inteiro idadeAnos, idadeMeses, idadeDias, TotalDias

		escreva ("qual a sua idade?: ")
		leia (idadeAnos)

		escreva ("x anos e quantos meses?: ")
		leia (idadeMeses)

		escreva ("x anos, x meses e quantos dias?: ")
		leia (idadeDias)		
		
		TotalDias = (idadeAnos*365) + (idadeMeses*31) + idadeDias 

		escreva ("Sua idade em dias é de: ", +TotalDias , "dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 235; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */