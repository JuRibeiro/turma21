programa
{
	
	funcao inicio()
	{

	//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		inteiro horas
		inteiro minutos
		inteiro segundos 
		inteiro duracao_evento

		escreva ("qual a duração do evento?")
		leia (duracao_evento)

		horas = duracao_evento/3600
		minutos = duracao_evento%3600/60
		segundos = (duracao_evento%3600)%60

		escreva ("Duração em horas: ", +horas)
		escreva ("Duração em minutos: ", +minutos)
		escreva ("Duração em segundos: ", +segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */