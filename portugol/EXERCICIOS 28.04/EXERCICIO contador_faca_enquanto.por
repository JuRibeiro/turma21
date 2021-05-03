programa
{
	
	funcao inicio()
	{
		/*FAÇA 
		 * 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
		 */
		 
		//refatoramento de codigo
		//resolve o mesmo problema
		//d forma otimizada
		inteiro contador=1
		
		inteiro vezes

		escreva ("Quantas vezes voce deseja repetir a frase?: ")
		leia (vezes)

		faca
		{
			escreva(contador," Hello World \n")
			contador = contador + 1 //operador de incremento
			//contador ++ é a mesma coisa que o de cima 
			//a unica operação na programação 
			//que é da direita para esquerda é 
			//a da programação
		}
		enquanto (contador<=vezes)

		para (inteiro x = 0; x<vezes; x++) //x+=2 incremento de 2
		{
			escreva(contador," Hello World \n")
		}
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */