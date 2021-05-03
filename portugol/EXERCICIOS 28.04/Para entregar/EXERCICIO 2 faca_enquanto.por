programa
{
	
	funcao inicio()
	{
		/* FAÇA .. ENQUANTO
		 * 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
		 */

		 inteiro numero, soma=0, contador=1

		 escreva ("Digite um numero de 1 a 9: ")
		 leia (numero)

		 faca
		{
			soma = soma + contador  
			//a unica operação na matematica 
			//que é da direita para esquerda é 
			//a da programação

			contador = contador+1
		}
		enquanto (contador<=numero)

		escreva ("o soma dos numeros até o numero escolhido é de: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */