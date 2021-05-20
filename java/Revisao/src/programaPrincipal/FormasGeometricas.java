package programaPrincipal;

import java.util.Scanner;

import revisao.Circulo;
import revisao.Quadrado;
import revisao.TrianguloRetangulo;

public class FormasGeometricas 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		//variavel
		//int ladoA;
		
		Circulo circulo = new Circulo(3.0); //instanciando o objeto
		//circulo.getRaio();
		//circulo.setRaio(2.0);
		System.out.println("Circulo");
		System.out.println("raio do circulo "+circulo.getRaio());
		System.out.println(circulo.area());
		System.out.println(circulo.perimetro());
		
		//Triangulo triangulo = new Triangulo ();  abstrata
		
		System.out.println();
		System.out.println("Quadrado");
		Quadrado quadrado = new Quadrado (2.3, 2.3, 2.3, 2.3);
		quadrado.area();
		System.out.println(quadrado.area());
		
		
		System.out.println();
		System.out.println("Triangulo");
		
		TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo (5, 4, 3, 4, 3);
		
		trianguloRetangulo.getAltura();
		System.out.println(trianguloRetangulo.getAltura());
		
		
		//primeiro pedir os valores e depois instanciar
		//Quadrado quadrado1 = new Quadrado ();
		
		System.out.println("Teste user\n");
		System.out.println("Informe o valor de ladoA: ");
		double ladoA = leia.nextDouble();
		
		System.out.println("Informe o valor de ladoB: ");
		double ladoB = leia.nextDouble();
		
		System.out.println("Informe o valor de ladoC: ");
		double ladoC = leia.nextDouble();
		
		System.out.println("Informe o valor de ladoD: ");
		double ladoD = leia.nextDouble();
		
		Quadrado quadrado1 = new Quadrado (ladoA, ladoB, ladoC, ladoD );
		
		quadrado1.area();
		System.out.println(quadrado1.area());
		
	}

}
