programa
{
	
	funcao inicio()
	{
		/*
		 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */
		 //variaveis
		inteiro n1,n2,n3,n4, resultanteQuadradon1, resultanteQuadradon2, resultanteQuadradon3, resultanteQuadradon4

		//entrada
		escreva ("Informe o primeiro numero: ")
		leia (n1)

		escreva ("Informe o segundo numero: ")
		leia (n2)

		escreva ("Informe o terceiro numero: ")
		leia (n3)

		escreva ("Informe o quarto numero: ")
		leia (n4)

		//processamento 
		resultanteQuadradon1 = n1 * n1 
		resultanteQuadradon2 = n2 * n2
		resultanteQuadradon3 = n3 * n3
		resultanteQuadradon4 = n4 * n4


		se (resultanteQuadradon3 >= 1000)
			{
				escreva ("A resultante do quadrado do terceiro numero informado: ", n3, " é >= 1000, sua raiz quadrada é: " , resultanteQuadradon3)
			}

		senao
			{
				escreva ("Resultante do quadrado do primeiro numero: ", resultanteQuadradon1, "\n")
				escreva ("Resultante do quadrado do segundo numero: ", resultanteQuadradon2, "\n")
				escreva ("Resultante do quadrado do terceiro numero: ", resultanteQuadradon3, "\n")
				escreva ("Resultante do quadrado do quarto numero: ", resultanteQuadradon4, "\n")
			}
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 104; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */