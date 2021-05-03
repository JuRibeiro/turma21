programa
{
	
	funcao inicio()
	{
		//nome-objetivo
		//inicio
		/*
		 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		hora - 1 hora - 60 minutos - 60 x 60 = 3600s
		minuto - 1 minuto - 60 segundos
		segundos
		 */
			//variaveis
		inteiro tempoDuracao, horas, minutos, segundos
			//entradas
		escreva ("Informe o tempo do evento em segundos:")
		leia (tempoDuracao)
			//processamentos - modo de preparo
		horas = (tempoDuracao / 3600)
		minutos = (tempoDuracao % 3600) / 60
		segundos = (tempoDuracao % 3600) % 60	
		
			//saidas
		escreva ("Hora(s):", +horas, "\n")
		escreva ("Minutos(s):", +minutos, "\n")
		escreva ("Segundo(s):", +segundos, "\n")
		//fim
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 453; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */