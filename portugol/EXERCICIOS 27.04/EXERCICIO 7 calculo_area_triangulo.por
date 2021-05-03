programa
{
	
	funcao inicio()
	{
		/*
		 * 7) Receber valores de base e altura de um triângulo e verificar 
		 * se são valores válidos (positivos maiores que zero). Em caso afirmativo, 
		 * calcular a área do triângulo
		 */

		 //declaração de variaveis 
		 inteiro num1, num2
		 inteiro calculoTriangulo

		 //entradas
		 escreva ("Informe um numero para calculo da area de um triangulo: ")
		 leia (num1)

		 escreva ("informe outro numero para calculo da area de um triangulo: ")
		 leia (num2)

		 //processamento 
		 se ((num1 > 0) e (num2 >0))
		 {
		 	calculoTriangulo = (num1 * num2) / 2
		 	escreva ("a área do triangulo é de: ", calculoTriangulo, " centimetros \n")
		 }
		 senao 
		 {
		 	escreva ("numero negativo, impossivel calcular a area do triangulo")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */