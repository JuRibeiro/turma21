package Lista1;

import java.util.Scanner;

public class Tarefa4 
{
	static public void main (String args[])
	{
	/*8. O custo ao consumidor de um carro novo é a soma do 
	 * custo de fábrica com a percentagem do distribuidor e dos 
	 * impostos (aplicados ao custo de fábrica). Supondo que a percentagem 
	 * do distribuidor seja de 28% e os impostos de 45%, escrever um sistema 
	 * que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
	 */
	
	//variaveis
	int custoTotal, custoFabrica, custoDistribuidor, imposto;
	
	//instanciar = criar teclado 
	Scanner leia = new Scanner(System.in);
	
	//entrada
	System.out.println("Informe o custo de fábrica do carro:");
	custoFabrica = leia.nextInt();
	
	//processamento de dados
	imposto = (45 * custoFabrica) / 100;
	custoDistribuidor = (28 * custoFabrica) / 100;
	custoTotal = custoFabrica + custoDistribuidor + imposto;
	
	//saida de dados
	System.out.println("\n------- NOTA FISCAL -------");
	System.out.println("Concessionária do Brasil, aqui você pode! \n");
	System.out.println("Custo de Fábrica: R$"+ custoFabrica );
	System.out.println("Custo dos impostos: R$ "+imposto);
	System.out.println("Custo do Distribuidador: R$"+custoDistribuidor);
	System.out.println("O valor total que irá pagar no carro é de: R$"+custoTotal);
	
	leia.close();
	
	}

}
