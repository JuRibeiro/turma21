
public class ProjetoJava 
{
	public static void main (String args[])
	{
			//10 movimentos - inclusao e exclusao de notas
			//media zero possivel, mas negativa nao
			//aluno deve ter matricula e cpf
			//
			//nome da escola e slogan
		Scanner leia = new Scanner (System.in);	

			funcao double pedirCreditoPos() 
			{
				double credito = 0.00
				System.out.println("\nDigite o valor dos creditos(limite 5 pontos): ");
				leia(credito);
				return credito;
			}
			
			
			final int MOVIMENTACOES = 10;
			int matricula;
			String cpf;
			double pontosTotais = 0.00;
			double pontos [];
			int pontosB = 10;
			boolean status;
			int resposta;
			int tipoConta,contador=0;
			char tipoMovimento;
			char continuar;
			int niver=0;
			boolean bonusGrad = false;
			int respGrad;
			String inserirNota = " Digite I para inclus�o de notas ou R para retirada de notas: ";
			double notaExtra = 0.00;
			double usoExtra=0.00;
			boolean usarCreditoMestrado;

			System.out.println("ESCOLA GERA��O G3\n");						//tela 1
			System.out.println("Assista. Aprenda. Execute \n\n");
			System.out.println("Digite sua matr�cula: ");
			leia(matricula);
			System.out.println("\nDigite seu CPF: ");
			leia(cpf);
			System.out.println("\nStatus da m�tricula? (1 - ativa / 2 - inativa) ");
			leia (resposta);

			if(resposta == 1)
			{
				status = true;
			}
			else
			{
				 status = false;
			}
			System.out.println();
			
			System.out.println("ESCOLA GERA��O G3\n");
			System.out.println("Assista. Aprenda. Execute\n");
			System.out.println("=========================");
			System.out.println("\nMatr�cula: " ,matricula, "\n");
			System.out.println("CPF: " ,cpf, "\n");
			
			if(status == true)
				{
					System.out.println("A conta do aluno(a) est� ativa.\n\n");
				}
			else
				{
					escreva ("A conta do aluno(a) est� inativa.\n\n");
				}
			
			System.out.println("\n***TIPO DE ENSINO:***");
			System.out.println("\n 1- B�SICO\n 2- M�DIO\n 3- GRADUA��O\n 4- P�S\n 5- MESTRADO\n 6- SAIR\n");
			System.out.println("\nDIGITE O C�DIGO DA OP��O SELECIONADA: ");
			leia(tipoConta);
			
				se (tipoConta >= 1 && tipoConta <= 5) 
				{
					System.out.println();
					
					System.out.println("ESCOLA GERA��O G3\n");			//tela 2
					System.out.println("Assista. Aprenda. Execute.\n");
					System.out.println("=========================\n\n");
				
						if (tipoConta == 1)
						{
							System.out.println("ENSINO B�SICO\n");
							System.out.println("Digite o dia do seu anivers�rio: ");
							leia(niver);
						} 
						else if (tipoConta == 2) 
						{
							System.out.println("ENSINO M�DIO\n");
							
						}
						else if (tipoConta == 3)
						{
							System.out.println("ENSINO GRADU��O\n");
							
						}
						else if (tipoConta == 4) 
						{
							System.out.println("ENSINO P�S\n");
							
						}
						else if (tipoConta == 5) 
						{
							System.out.println("ENSINO MESTRADO\n");
							// adicionar notas extras a qualquer momento
							inserirNota+=" (Caso queira utilizar sua nota extra pressione Z) ";
							notaExtra=10.0;
							// fim da parte extra
							
						}
						else if (tipoConta == 6) 
						{
							System.out.println("SAIR\n");
							
						}
						
						System.out.println("\nMatr�cula: " ,matricula, "\n");
						System.out.println("CPF: " ,cpf, "\n");
				
						if (status == verdadeiro)
						{
							System.out.println("A conta do aluno(a) est� ativa.\n");
						}
						else if
						{
							System.out.println("A conta do aluno(a) est� inativa.\n");
						}
						
						System.out.println("Nota atual: " ,pontosTotais, "\n");
						System.out.println("\n---MOVIMENTOS---\n");
						System.out.println("\nVOC� POSSUI O LIMITE DE 10 MOVIMENTA��ES\n");
				
						for(inteiro i = 0; i < MOVIMENTACOES; i++) 
						{
						System.out.println("\nMov.",i+1, inserirNota);
						leia(tipoMovimento);
							if(tipoMovimento == 'I' || tipoMovimento == 'i') 
							{
				
								System.out.println("Pontos totais : "+pontosTotais+"\n");
								
								System.out.println("Valor a ser inclus�o na nota: ");
								leia(pontos[i]);
								pontosTotais = pontosTotais + pontos[i];
				
								if (bonusGrad == false)
								{
								if(tipoConta == 3 && pontosTotais <0)
								{
									System.out.println("\nNota negativa. Deseja utilizar seu b�nus de gradua��o? [m�x. 2 pontos] (1-Sim/2-N�o) ");
									leia(respGrad);
									
									if (respGrad == 1)
									{
										bonusGrad=true;
										pontosTotais = pontosTotais + 2;
										System.out.println("\n\nB�nus adicionado com sucesso!!!\n");
										System.out.println("\nPontos totais : "+pontosTotais+"\n\n");
									}
								}
								}
								
								System.out.println("Continuar? S-sim/N-n�o: ");
								leia(continuar);
								
								if (continuar =='N' || continuar == 'n') 
								{
									pare;
								}
								
							} 
							
							else if (tipoMovimento == 'R' || tipoMovimento == 'r') 
							{
				
								System.out.println("Pontos totais : "+pontosTotais+"\n");
				
								System.out.println("Valor a ser retirado da nota: ");
								leia(pontos[i]);
								pontosTotais = pontosTotais - pontos[i];
				
								if(bonusGrad == falso)
								{
									
									if(tipoConta == 3 && pontosTotais <0)
								{
									System.out.println("\nNota negativa. Deseja utilizar seu b�nus de gradua��o? [m�x. 2 pontos] (1-Sim/2-N�o) ");
									leia(respGrad);
									
									if (respGrad == 1)
									{
										bonusGrad=true;
										pontosTotais = pontosTotais + 2;
										System.out.println("\n\nB�nus adicionado com sucesso!!!\n");
										System.out.println("Pontos totais : "+pontosTotais+"\n\n");
									}
								}
								}
				
								System.out.println("Continuar? S-sim/N-n�o: ");
								leia(continuar);
								
								if (continuar =='N' || continuar == 'n') 
								{
									pare;
								}
							} 
							
							else if ((tipoMovimento=='Z' || tipoMovimento=='z')&& tipoConta==5 )
							{
								System.out.println("Pontos totais : "+pontosTotais+"\n");
				
								System.out.println("Quantos pontos quer utilizar? Disponivel "+notaExtra+" creditos");
								leia(usoExtra);
								
								if(usoExtra<=notaExtra)
								{
									
									notaExtra-=usoExtra;
									pontosTotais+=usoExtra;
									i--;
									System.out.println("Foram adicionados "+usoExtra+" creditos e sobraram "+notaExtra);
									System.out.println("Continuar? S-sim/N-n�o: ");
									leia(continuar);
									
									if (continuar =='N' || continuar == 'n') 
									{
										pare;
									}
								}
								else
								{
									System.out.println("N�o possui essa nota extra para ser adicionada, volte a inclus�o de notas");
									i--;									
								}
							}
							
							else 
							{
								System.out.println(" Op��o Inv�lida");
								i--;
							}
				
						} 
						
						System.out.println("\n\nNota total: " ,pontosTotais,"\n");
				
						switch (tipoConta)
						{
							case 1:
							{
							System.out.println("\nDeseja usar o acr�scimo b�nus de anivers�rio, caso esteja dispon�vel? S-sim/N-n�o  ");
							leia(continuar);
							System.out.println();
							System.out.println("ESCOLA GERA��O G3\n");
							System.out.println("Assista. Aprenda. Execute  \n\n");
							System.out.println("Ensino B�sico \n");
							System.out.println("\nMatr�cula: " ,matricula, "\n");
							System.out.println("CPF: " ,cpf, "\n");
								
							if(continuar == 'S' ou continuar == 's')
							{
								if(niver == Calendario.dia_mes_atual()) 
								{
									pontosTotais = (pontosTotais*0.1)+ pontosTotais;
									System.out.println("\nParab�ns! Voc� tem direito a um acr�scimo b�nus de 10% na sua nota final!\n");
									System.out.println("\nSua nota final com o b�nus � de: " ,pontosTotais);
								}
								else 
								{
									System.out.println("\nVoc� n�o tem direito ao b�nus de anivers�rio");
								}
							} 
							else
							{
								System.out.println("Opera��o finalizada");
							}
							}
							break;
							
							
							caso 2:
				/*Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo 
				 * deseja solicitar impress�o do boletim, limitando em apenas 3 emiss�es no m�s.
				 */
								escreva ("\nDeseja realizar a impress�o do seu boletim? S-sim / N-n�o ")
								leia (tipoMovimento)
								limpa()
								se (tipoMovimento =='S' ou tipoMovimento == 's') 
								{
									para(inteiro i= 3; i > 0; i--)
									{
																limpa()
										escreva("ESCOLA GERA��O G3\n")						//tela 3
										escreva("Assista. Aprenda. Execute  \n\n")
										escreva ("Ensino M�dio \n")
										escreva("\nMatr�cula: " ,matricula, "\n")
										escreva("CPF: " ,cpf, "\n")
										
										escreva("Voce tem ", (i-1), " solicita��o(�es) para impress�o do boletim este m�s\n")
										escreva("\n---BOLETIM MENSAL---\n\n")
										
										para (inteiro j = 0; j < pontosB; j++) 
										{
											escreva("Atividade: " , (j+1) , " Pontua��o: " ,  pontos[j] , "\n")
											
										} 
							
										se (i > 1)
											{ 
												
												escreva("\nDeseja solicitar o boletim novamente? S-sim/N-n�o: ")
												leia(tipoMovimento)
												se (tipoMovimento == 'N' ou tipoMovimento =='n') 
												{
													i = 0 //aqui sai porque i = 0 sai do looping para
												}
											}
									}
								}
								senao
								{
										limpa()
										escreva("ESCOLA GERA��O G3\n")						//tela 3
										escreva("Assista. Aprenda. Execute  \n\n")
										escreva ("Ensino M�dio \n")
										escreva("\nMatr�cula: " ,matricula, "\n")
										escreva("CPF: " ,cpf, "\n")
									}
							pare
				
							caso 3:
								limpa()
								escreva("ESCOLA GERA��O G3\n")
								escreva("Assista. Aprenda. Execute\n\n")
								escreva("Ensino Gradua��o\n")
								escreva("\nMatr�cula: " ,matricula, "\n")
								escreva("CPF: " ,cpf, "\n")
								se (status == verdadeiro)
									{
										escreva ("A conta do aluno(a) est� ativa.\n\n")
									}
									senao
									{
										escreva ("A conta do aluno(a) est� inativa.\n\n")
									}
								escreva("Nota total: " ,pontosTotais,"\n")
				
							pare
				
							caso 4: 
				
								pontosTotais += pedirCreditoPos()
								limpa()
								
								escreva("ESCOLCA GERA��O G3\n")						//tela 3
								escreva("Assista. Aprenda. Execute  \n\n")
								escreva ("Ensino P�s Gradua��o \n")
								escreva("\nMatr�cula: " ,matricula, "\n")
								escreva("CPF: " ,cpf, "\n")
				
								se (status == verdadeiro)
								{
									escreva ("A conta do aluno(a) est� ativa.\n")
								}
								senao
								{
									escreva ("A conta do aluno(a) est� inativa.\n")
								}
								escreva("Nota total: " ,pontosTotais,"\n")
				
							pare
				
							caso 5:
				
								inteiro teste=0 
								escreva("Gostaria de utilizar os seus creditos? 0-n�o 1-sim ")
								leia(teste)
								usarCreditoMestrado =(teste>0)
								se (usarCreditoMestrado==verdadeiro){
									escreva("Quantos pontos quer utilizar? Disponivel "+notaExtra+" creditos")
									leia(usoExtra)
									se(usoExtra<=notaExtra){
										notaExtra-=usoExtra
										pontosTotais+=usoExtra	
										limpa()
									}senao{
										limpa()
										escreva("nao h� nota para ser adicionada, o valor m�ximo foi agregado")
										pontosTotais+=notaExtra
									}
										
									
									escreva("Ensino Mestrado\n")
									escreva("\nMatricula: " ,matricula, "\n")
									escreva("CPF: " ,cpf, "\n")
									se (status == verdadeiro)
									{
										escreva ("A conta do aluno(a) esta ativa.\n")
									}
									senao
									{
										escreva ("A conta do aluno(a) esta inativa.\n")
									}
						
									escreva("Foram adicionados "+usoExtra+" creditos e sobraram "+notaExtra)
									escreva("\nNota total: " ,pontosTotais,"\n")
								}senao{
									limpa()
									escreva("Ensino Mestrado\n")
									escreva("\nMatricula: " ,matricula, "\n")
									escreva("CPF: " ,cpf, "\n")
									se (status == verdadeiro)
									{
										escreva ("A conta do aluno(a) esta ativa.\n")
									}
									senao
									{
										escreva ("A conta do aluno(a) esta inativa.\n")
									}
						
									escreva("Foram adicionados "+usoExtra+" creditos extras e sobraram "+notaExtra)
									escreva("\nNota total: " ,pontosTotais,"\n")
								}
				
							pare
					
						}
				}
				else if(tipoConta >6 )
				{
					System.out.println();
					System.out.pritln("=========================");
					System.out.println("Op��o Inv�lida");
					System.out.println("=========================");
					Util.aguarde(2500);//2segundo e meio
					System.out.println();
					inicio();
				}
				}
				

		}
	}

}
