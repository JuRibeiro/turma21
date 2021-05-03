programa
{
	
	funcao inicio()
	{
/*Demanda:
-Pedir o nome do usuário 
-Como se identifica (Masc. Femin. Outro)
-Pedir ano de nascimento
Regra:
-Até 18 anos, jovem
-Acima de 18 até 50, adulto(a)
-Acima de 50, idoso(a)
Para mulher idosa, para homem idoso, para outro idose
Adulta, adulto, adulte */

	caracter genero //''
	cadeia nome // ""
	inteiro anoNascimento

	escreva ("Qual o seu nome?: ")
	leia (nome)

	escreva ("Que genero voce se identifica? *responda com M (masculino) F (feminino) O (outro): ")
	leia (genero)

	escreva ("Qual seu ano de nascimento?: ")
	leia (anoNascimento)

	se (anoNascimento<=1971)
	{
		se (genero=='M')
		{
			escreva ("oi ", nome, " você é um idoso")
		}
		senao se (genero=='F')
		{
			escreva ("oi ", nome, " você é uma idosa")
		}
		senao 
		{
			escreva ("oi ", nome, " você é um idose")
		}
	}
	senao se (anoNascimento<=2003)
	{
			se (genero=='M')
		{
			escreva ("oi ", nome, " você é adulto")
		}
		senao se (genero=='F')
		{
			escreva ("oi ", nome, " você é uma adulta")
		}
		senao 
		{
			escreva ("oi ", nome, " você é um adulte")
		}
	}
	senao 
	{
		escreva ("oi ", nome, " você é jovem")
	}
	
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 198; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */