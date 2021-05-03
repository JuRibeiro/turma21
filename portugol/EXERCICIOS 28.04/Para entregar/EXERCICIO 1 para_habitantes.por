programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		/*
		 * PARA
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população; ok
b) média do número de filhos; ok
c) maior salário; ok
d) percentual de pessoas com salário até R$100,00.
		 */
			//declaraçcao de variaveis
		 inteiro habitantes, numeroFilhos=0
		 real mediaSalario=0.00, mediaFilhos=0.00, maiorSalario=0.00
		 real percent100=0.00, salario

		 
			//entraada de dados
		 para(habitantes=1; habitantes<=2; habitantes++)
		 {
		 	escreva ("\nInforme o valor do seu salario: ")
		 	leia(salario)

		 	escreva("\nInforme o numero de filhos que possui: ")
		 	leia(numeroFilhos)

		 mediaFilhos = mediaFilhos + numeroFilhos
		 mediaSalario = mediaSalario + salario

		 se(salario > maiorSalario) 
		     {
				maiorSalario = salario
			}

		 se (salario <=100)
		    {
		 		percent100++
		    }
		 }

		    //processamento
		 
		 	mediaFilhos = mat.arredondar ((mediaFilhos / habitantes), 2)
		 	mediaSalario = mat.arredondar ((mediaSalario /habitantes),2)
		 	percent100 = mat.arredondar (((percent100/habitantes) * 100),2)

		 	//saida
			escreva ("\n-----------------Resultado da Pesquisa----------------")
		 	
		 	escreva ("\nA media de filho(s) da população é de: ", mediaFilhos, " filho(s) por familia")
		 	
			escreva ("\nA média de salário da população é de: R$ ", mediaSalario)

			escreva ("\nO maior salario é de: R$", maiorSalario)

			escreva ("\nO percentual de habitantes com salário menor de R$100,00 é de: ", percent100, "%")
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 986; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */