programa
{
	funcao linha ()
	{
		escreva ("\n---------------------------------------------------")
	}
	funcao inicio()
	{
		/*
		 * 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos 
		 * de indústrias que são altamente poluentes do meio ambiente. O índice de poluição 
		 * aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º 
		 * grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 
		 * as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
		 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas 
		 * atividades. Faça um sistema que leia o índice de poluição medido e emita a notificação 
		 * adequada aos diferentes grupos de empresas.
		 */

		 //declaração de variaveis 
		 real indicePoluicao =0.00

		 //entradas
		 escreva ("Qual é o indice de poluição da sua empresa hoje?: ") 
		 leia (indicePoluicao)
		 linha()

		 //processamento
		 se (indicePoluicao <= 0.25 e indicePoluicao < 0.29)
		 {
		 	escreva ("\n Indice aceitavel")
		 	linha()
		 }
		 senao se (indicePoluicao >= 0.3 e indicePoluicao < 0.39)
		 {
		 	escreva ("\nIndustrias do Grupo 1, favor suspender suas atividades \n")
		 	linha()
		 }
		 senao se (indicePoluicao >= 0.4 e indicePoluicao < 0.49)
		 {
		 	escreva ("\nIndustrias do Grupo 1 e 2, favor suspender suas atividades \n")
		 	linha()
		 }
		 senao se (indicePoluicao >= 0.5)
		 {
		 	escreva ("\nIndustrias do Grupo 1 , 2 e 3, favor suspender suas atividades \n")
		 	linha()
		 }
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */