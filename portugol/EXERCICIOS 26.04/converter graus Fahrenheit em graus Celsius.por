programa
{
	
	funcao inicio()
	{
	real graus
	real Fahrenheit
	cadeia Nome 
	real graus_resultado
	
		//Para converter graus Celsius em graus Fahrenheit, multiplique por 1,8 e adicione 32.
		//°F = °C × 1, 8 + 32
		//Para converter graus Fahrenheit em graus Celsius, subtraia 32 e divida por 1,8.
		//°C = (°F − 32) ÷ 1, 8

			escreva ("Nome: ")
			leia (Nome)
			
			escreva ("Qual é a temperatura da sua cidade em Fahrenheit: ")
			leia (Fahrenheit)

			
			//processamento
			graus_resultado = (Fahrenheit - 32) / 1.8
			
			//saidas
			escreva ("A conversão de Fahrenheit para Celsius é: " +graus_resultado)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 67; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */