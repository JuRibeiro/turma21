package principal;

import java.util.Scanner;

import entidades.Retangulo;

public class CalculoAreas {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		//double area1=0.00;
		//double area2=0.00;
		
		//instanciar o retangulo
		Retangulo retangulo1 = new Retangulo ();  //ctrl + shift + o = traz a classe criada
		Retangulo retangulo2 = new Retangulo ();
		
		System.out.println("Retangulo 1");
		System.out.println("Digite a base 1: ");
		retangulo1.base = leia.nextDouble();
		
		System.out.println("Digite a altura 1: ");
		retangulo1.altura = leia.nextDouble();
		
		//area1 = retangulo1.base * retangulo1.altura ;

		System.out.printf("Area do retangulo 1: ");
		retangulo1.area();
		
		System.out.println();
		
		System.out.println("Retangulo 2");
		System.out.println("Digite a base 2: ");
		retangulo2.base = leia.nextDouble();
		
		System.out.println("Digite a altura 2: ");
		retangulo2.altura = leia.nextDouble();
		
		//area2 = retangulo2.base * retangulo2.altura ;
		
		System.out.printf("Area do retangulo 2: ");
		retangulo2.area();
		
		leia.close();
		
	}

}
