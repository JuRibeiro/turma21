
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
			String inserirNota = " Digite I para inclusão de notas ou R para retirada de notas: ";
			double notaExtra = 0.00;
			double usoExtra=0.00;
			boolean usarCreditoMestrado;

			System.out.println("ESCOLA GERAÇÃO G3\n");						//tela 1
			System.out.println("Assista. Aprenda. Execute \n\n");
			System.out.println("Digite sua matrícula: ");
			leia(matricula);
			System.out.println("\nDigite seu CPF: ");
			leia(cpf);
			System.out.println("\nStatus da mátricula? (1 - ativa / 2 - inativa) ");
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
			
			System.out.println("ESCOLA GERAÇÃO G3\n");
			System.out.println("Assista. Aprenda. Execute\n");
			System.out.println("=========================");
			System.out.println("\nMatrícula: " ,matricula, "\n");
			System.out.println("CPF: " ,cpf, "\n");
			
			if(status == true)
				{
					System.out.println("A conta do aluno(a) está ativa.\n\n");
				}
			else
				{
					escreva ("A conta do aluno(a) está inativa.\n\n");
				}
			
			System.out.println("\n***TIPO DE ENSINO:***");
			System.out.println("\n 1- BÁSICO\n 2- MÉDIO\n 3- GRADUAÇÃO\n 4- PÓS\n 5- MESTRADO\n 6- SAIR\n");
			System.out.println("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
			leia(tipoConta);
			
				se (tipoConta >= 1 && tipoConta <= 5) 
				{
					System.out.println();
					
					System.out.println("ESCOLA GERAÇÃO G3\n");			//tela 2
					System.out.println("Assista. Aprenda. Execute.\n");
					System.out.println("=========================\n\n");
				
						if (tipoConta == 1)
						{
							System.out.println("ENSINO BÁSICO\n");
							System.out.println("Digite o dia do seu aniversário: ");
							leia(niver);
						} 
						else if (tipoConta == 2) 
						{
							System.out.println("ENSINO MÉDIO\n");
							
						}
						else if (tipoConta == 3)
						{
							System.out.println("ENSINO GRADUÇÃO\n");
							
						}
						else if (tipoConta == 4) 
						{
							System.out.println("ENSINO PÓS\n");
							
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
						
						System.out.println("\nMatrícula: " ,matricula, "\n");
						System.out.println("CPF: " ,cpf, "\n");
				
						if (status == verdadeiro)
						{
							System.out.println("A conta do aluno(a) está ativa.\n");
						}
						else if
						{
							System.out.println("A conta do aluno(a) está inativa.\n");
						}
						
						System.out.println("Nota atual: " ,pontosTotais, "\n");
						System.out.println("\n---MOVIMENTOS---\n");
						System.out.println("\nVOCÊ POSSUI O LIMITE DE 10 MOVIMENTAÇÕES\n");
				
						for(inteiro i = 0; i < MOVIMENTACOES; i++) 
						{
						System.out.println("\nMov.",i+1, inserirNota);
						leia(tipoMovimento);
							if(tipoMovimento == 'I' || tipoMovimento == 'i') 
							{
				
								System.out.println("Pontos totais : "+pontosTotais+"\n");
								
								System.out.println("Valor a ser inclusão na nota: ");
								leia(pontos[i]);
								pontosTotais = pontosTotais + pontos[i];
				
								if (bonusGrad == false)
								{
								if(tipoConta == 3 && pontosTotais <0)
								{
									System.out.println("\nNota negativa. Deseja utilizar seu bônus de graduação? [máx. 2 pontos] (1-Sim/2-Não) ");
									leia(respGrad);
									
									if (respGrad == 1)
									{
										bonusGrad=true;
										pontosTotais = pontosTotais + 2;
										System.out.println("\n\nBônus adicionado com sucesso!!!\n");
										System.out.println("\nPontos totais : "+pontosTotais+"\n\n");
									}
								}
								}
								
								System.out.println("Continuar? S-sim/N-não: ");
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
									System.out.println("\nNota negativa. Deseja utilizar seu bônus de graduação? [máx. 2 pontos] (1-Sim/2-Não) ");
									leia(respGrad);
									
									if (respGrad == 1)
									{
										bonusGrad=true;
										pontosTotais = pontosTotais + 2;
										System.out.println("\n\nBônus adicionado com sucesso!!!\n");
										System.out.println("Pontos totais : "+pontosTotais+"\n\n");
									}
								}
								}
				
								System.out.println("Continuar? S-sim/N-não: ");
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
									System.out.println("Continuar? S-sim/N-não: ");
									leia(continuar);
									
									if (continuar =='N' || continuar == 'n') 
									{
										pare;
									}
								}
								else
								{
									System.out.println("Não possui essa nota extra para ser adicionada, volte a inclusão de notas");
									i--;									
								}
							}
							
							else 
							{
								System.out.println(" Opção Inválida");
								i--;
							}
				
						} 
						
						System.out.println("\n\nNota total: " ,pontosTotais,"\n");
				
						switch (tipoConta)
						{
							case 1:
							{
							System.out.println("\nDeseja usar o acréscimo bônus de aniversário, caso esteja disponível? S-sim/N-não  ");
							leia(continuar);
							System.out.println();
							System.out.println("ESCOLA GERAÇÃO G3\n");
							System.out.println("Assista. Aprenda. Execute  \n\n");
							System.out.println("Ensino Básico \n");
							System.out.println("\nMatrícula: " ,matricula, "\n");
							System.out.println("CPF: " ,cpf, "\n");
								
							if(continuar == 'S' ou continuar == 's')
							{
								if(niver == Calendario.dia_mes_atual()) 
								{
									pontosTotais = (pontosTotais*0.1)+ pontosTotais;
									System.out.println("\nParabéns! Você tem direito a um acréscimo bônus de 10% na sua nota final!\n");
									System.out.println("\nSua nota final com o bônus é de: " ,pontosTotais);
								}
								else 
								{
									System.out.println("\nVocê não tem direito ao bônus de aniversário");
								}
							} 
							else
							{
								System.out.println("Operação finalizada");
							}
							}
							break;
							
							
							caso 2:
				/*Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo 
				 * deseja solicitar impressão do boletim, limitando em apenas 3 emissões no mês.
				 */
								escreva ("\nDeseja realizar a impressão do seu boletim? S-sim / N-não ")
								leia (tipoMovimento)
								limpa()
								se (tipoMovimento =='S' ou tipoMovimento == 's') 
								{
									para(inteiro i= 3; i > 0; i--)
									{
																limpa()
										escreva("ESCOLA GERAÇÃO G3\n")						//tela 3
										escreva("Assista. Aprenda. Execute  \n\n")
										escreva ("Ensino Médio \n")
										escreva("\nMatrícula: " ,matricula, "\n")
										escreva("CPF: " ,cpf, "\n")
										
										escreva("Voce tem ", (i-1), " solicitação(ões) para impressão do boletim este mês\n")
										escreva("\n---BOLETIM MENSAL---\n\n")
										
										para (inteiro j = 0; j < pontosB; j++) 
										{
											escreva("Atividade: " , (j+1) , " Pontuação: " ,  pontos[j] , "\n")
											
										} 
							
										se (i > 1)
											{ 
												
												escreva("\nDeseja solicitar o boletim novamente? S-sim/N-não: ")
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
										escreva("ESCOLA GERAÇÃO G3\n")						//tela 3
										escreva("Assista. Aprenda. Execute  \n\n")
										escreva ("Ensino Médio \n")
										escreva("\nMatrícula: " ,matricula, "\n")
										escreva("CPF: " ,cpf, "\n")
									}
							pare
				
							caso 3:
								limpa()
								escreva("ESCOLA GERAÇÃO G3\n")
								escreva("Assista. Aprenda. Execute\n\n")
								escreva("Ensino Graduação\n")
								escreva("\nMatrícula: " ,matricula, "\n")
								escreva("CPF: " ,cpf, "\n")
								se (status == verdadeiro)
									{
										escreva ("A conta do aluno(a) está ativa.\n\n")
									}
									senao
									{
										escreva ("A conta do aluno(a) está inativa.\n\n")
									}
								escreva("Nota total: " ,pontosTotais,"\n")
				
							pare
				
							caso 4: 
				
								pontosTotais += pedirCreditoPos()
								limpa()
								
								escreva("ESCOLCA GERAÇÃO G3\n")						//tela 3
								escreva("Assista. Aprenda. Execute  \n\n")
								escreva ("Ensino Pós Graduação \n")
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
								escreva("Nota total: " ,pontosTotais,"\n")
				
							pare
				
							caso 5:
				
								inteiro teste=0 
								escreva("Gostaria de utilizar os seus creditos? 0-não 1-sim ")
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
										escreva("nao há nota para ser adicionada, o valor máximo foi agregado")
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
					System.out.println("Opção Inválida");
					System.out.println("=========================");
					Util.aguarde(2500);//2segundo e meio
					System.out.println();
					inicio();
				}
				}
				

		}
	}

}
