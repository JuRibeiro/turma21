package lista5;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		int respostaAtivo;
		
		ClasseProdutoEletronicoTarefa3 cadProduto = new ClasseProdutoEletronicoTarefa3 ();
		
		//public String nomeProduto;
		//public int anoProduto;
		//public char marca;
		//public boolean ativo;
		
		System.out.printf("Informe o produto que deseja comprar: ");
		cadProduto.nomeProduto = leia.next().toUpperCase();
		
		System.out.printf("De que ano é o produto que deseja comprar?: ");
		cadProduto.anoProduto = leia.nextInt();
		
		System.out.printf("De que marca é este produto?: ");
		cadProduto.marca = leia.next().toUpperCase();
		
		System.out.printf("Deseja retirar este produto ativo?: 1-Ativado; 2-Desativado ");
		respostaAtivo = leia.nextInt();
		
		
		System.out.println();
		System.out.println("EXIBINDO AS INFORMAÇÕES DO PRODUTO");
		System.out.println();
		System.out.println("Nome do produto:" + cadProduto.nomeProduto);
		System.out.println("Ano do produto: "+ cadProduto.anoProduto);
		System.out.println("Marca do produto: "+ cadProduto.marca);
		
		if (respostaAtivo == 1)
		{
			System.out.println("O cliente ira retirar o produto: ativado");
		}
		else if (respostaAtivo == 2)
		{
			System.out.println("O cliente ira retirar o produto: desativado");
		}
		
		cadProduto.idadeProduto();
		System.out.println("Confirma seu pedido? S-sim N-não");
		
		leia.close();
	}

}
