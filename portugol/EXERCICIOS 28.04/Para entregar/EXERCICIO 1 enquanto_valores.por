programa
{
	
	funcao inicio()
	{
	
		/*ENQUANTO
		 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório ok
, a média ok
e o total de valores lidos. ok
O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
		 */
		inteiro numero=1, somatorio=0, media=0, totalValoresLidos=0, qtdVezes=0

		enquanto (numero != 0)
		{
			escreva ("Informe um numero positivo: ")
			leia (numero)

		somatorio = somatorio + numero

			se (numero>0)
			{
				totalValoresLidos++
			}

		media = somatorio / totalValoresLidos
		
		}

		escreva ("\nA soma dos valores informados é de: ", somatorio)
		escreva ("\nA quantidade de vezes que foram informados numeros !=0 foi de: ",totalValoresLidos, " vezes")
		escreva ("\nA média dos numeros informados é: ", media)
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */