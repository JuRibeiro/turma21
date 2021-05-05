package exercicios_aula;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIR 
{
public static void main(String[]args) 
	
	{
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nome;
		char opcao;
		boolean emergencial = true; //true ou false
		double imposto;
		double salarioBruto;
		double salarioBrutoAno;
		int auxilioEmergialFull = 3000;
		char aux;
		
		System.out.println("Insira o nome do contribuinte: ");
		nome= leia.next();
		
		System.out.println("Insira o gênero que você se identifica Digite M-mascuslino F-femino ou O-outros ");
		opcao = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Insira o salario mensal bruto: ");
		salarioBruto =leia.nextDouble();
		
		System.out.println("Voce recebeu auxilio emergencial S/N: ");
		aux =leia.next().toUpperCase().charAt(0);
		if (aux== 'S') {
			emergencial =true;
		}
		else if (aux== 'N') {
			emergencial= false;
		}
		salarioBrutoAno= (salarioBruto*12);
	
		if(salarioBrutoAno>60000) 
		{
			if(emergencial) 
			{
				if(salarioBrutoAno>= 5000 && salarioBrutoAno <6000) 
				{
				imposto=(salarioBrutoAno)*0.15+auxilioEmergialFull;
				System.out.println("O imposto de renda é: "+imposto);
				}
			}
		}
				
		if(salarioBrutoAno>= 6000 && salarioBrutoAno <10000) 
		{
				imposto=(salarioBrutoAno)*0.17+auxilioEmergialFull;
				System.out.println("O imposto de renda é: "+imposto);
		}
				
				if(salarioBrutoAno>= 10000) 
				{
					imposto=(salarioBrutoAno)*0.25+auxilioEmergialFull;
					System.out.println("O imposto de renda é: "+imposto);
				}
		leia.close();	
					
		}

}
