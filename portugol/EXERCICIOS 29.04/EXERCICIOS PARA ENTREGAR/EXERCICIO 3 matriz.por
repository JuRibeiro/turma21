programa
{
	
	funcao inicio()
	{
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2
		 */
		 //variaveis
		 inteiro N1 [3][2]
		 inteiro N2 [3][2]
		 inteiro M1 [3][2]
		 inteiro M2 [3][2]
		 
// PROCESSAMENTO MATRIZ N1
		 para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		escreva ("Informe os valores da matriz N1: ")
		 		leia (N1[linha][coluna])
		 	}
		 }

			 para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		 escreva ("[ ", N1[linha][coluna], " ]\n")
		 	}
		 }
// PROCESSAMENTO MATRIZ N2
		  para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		escreva ("Informe os valores da matriz N2: ")
		 		leia (N2[linha][coluna])
		 	}
		 }

		 para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		 escreva ("[ ", N2[linha][coluna], " ]\n")
		 	}
		 }
//processamento M1
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2
		 para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
		 	}
		 }

		 para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		 escreva ("Resultado da Matriz M1: \n")
		 		 escreva ("[ ", M1[linha][coluna], " ]\n")
		 	}
		 }
//processamento matriz N2
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2

		 para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
		 	}
		 }

		 para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		 escreva ("Resultado da Matriz M1: \n")
		 		 escreva ("[ ", M2[linha][coluna], " ]\n")
		 	}
		 }
		 limpa()
		 escreva ("RELENDO AS MATRIZES \n")

		escreva ("imprimindo a matriz M1:\n")
		para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		se (coluna < 1)
		 		{
		 			escreva ("[ ", M1[linha][coluna]," ]", " ")
		 		}
		 		senao
		 		{
		 			escreva ("[ ", M1[linha][coluna]," ]" ,"\n")
		 		}
		 	}
		 }

		 escreva ("imprimindo a matriz M2:\n")
		para (inteiro linha=0; linha<3; linha++)
		 {
		 	para(inteiro coluna=0; coluna<2; coluna++)
		 	{
		 		se (coluna < 1)
		 		{
		 			escreva ("[ ", M2[linha][coluna]," ]", " ")
		 		}
		 		senao
		 		{
		 			escreva ("[ ", M2[linha][coluna]," ]" ,"\n")
		 		}
		 	}
		 }

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2746; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */