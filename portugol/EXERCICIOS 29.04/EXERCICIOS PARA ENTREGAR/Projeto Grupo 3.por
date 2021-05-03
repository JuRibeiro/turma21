programa
{

	//10 movimentos - inclusao e exclusao de notas
	//media zero possivel, mas negativa nao
	//aluno deve ter matricula e cpf
	//
	//nome da escola e slogan
	
	funcao inicio()
	{

		
	const inteiro MOVIMENTACOES = 10
	inteiro matricula
	cadeia cpf
	real pontosTotais = 0.00
	real pontos [MOVIMENTACOES]
	logico status
	inteiro resposta
	caracter tipoConta
	caracter tipoMovimento
	caracter continuar


	escreva("ESCOLA Grupo 3\n")						//tela 1
	escreva("Assista. Aprenda. Execute \n\n")
	escreva("Digite sua matrícula: ")
	leia(matricula)
	escreva("\nDigite seu CPF: ")
	leia(cpf)
	escreva ("\nO aluno está 1 - ativo ou 2 - inativo? ")
	leia (resposta)

	se(resposta == 1 )
	{
		status = verdadeiro
	}
	senao
	{
		 status = falso
	}
	
	escreva("\n 1- BÁSICO\n 2- MÉDIO\n 3- GRADUAÇÃO\n 4- PÓS\n 5- MESTRADO\n 6- SAIR\n")
	escreva("DIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ")
	leia(tipoConta)
	limpa()

	escreva("ESCOLA \n")						//tela 2
	escreva("slogan \n\n")

		se (tipoConta == '1'){
			escreva("ENSINO BÁSICO\n")
		
		} senao se (tipoConta == '2') {
			escreva("ENSINO MÉDIO\n")
			
		}senao se (tipoConta == '3') {
			escreva("ENSINO GRADUAÇÃO\n")
			
		}senao se (tipoConta == '4') {
			escreva("ENSINO PÓS\n")
			
		}senao se (tipoConta == '5') {
			escreva("ENSINO MESTRADO\n")
			
		}senao se (tipoConta == '6') {
			escreva("SAIR\n")
			
		} senao {
			escreva("Opção inválida")
		}

		escreva("\nMatrícula: " ,matricula, "\n")
		escreva("CPF: " ,cpf, "\n")

		se (status == verdadeiro)
		{
			escreva ("A conta do aluno(a) está ativa.\n")
		}
		senao
		{
			escreva ("A conta do aluno(a) está inativa.\n")
		}
		
		escreva("Nota atual: " ,pontosTotais, "\n")
		escreva("\n---MOVIMENTOS---\n")

		para(inteiro i = 0; i < MOVIMENTACOES; i++) {
		escreva("\nMov.",i+1," Digite I para inclusão de notas ou R para retirada de notas: ")
		leia(tipoMovimento)
			se(tipoMovimento == 'I' ou tipoMovimento == 'i') {

				escreva("Pontos totais : "+pontosTotais+"\n")
				
				escreva("Valor a ser incluído na nota: ")
				leia(pontos[i])
				pontosTotais = pontosTotais + pontos[i]
				
				escreva("Continuar? S-sim/N-não: ")
				leia(continuar)
				se (continuar =='N' ou continuar == 'n') {
					pare
				}
				
			} senao se (tipoMovimento == 'R' ou tipoMovimento == 'r') {

				escreva("Pontos totais : "+pontosTotais+"\n")

				escreva("Valor a ser retirado da nota: ")
				leia(pontos[i])
				pontosTotais = pontosTotais - pontos[i]

				escreva("Continuar? S-sim/N-não: ")
				leia(continuar)
				se (continuar =='N' ou continuar == 'n') {
					pare
				}
			} senao {
				escreva(" Opção inválida")
				i--
			}

		} escreva("\nLIMITE DE 10 MOVIMENTAÇÕES\n")
		
		escreva("Nota total: " ,pontosTotais,"\n")

		// pergunta relacionada ao tipo de ensino
		



	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */