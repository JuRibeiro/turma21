package aulaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ExercicioCollections 
{
	public static void main(String[] args) 
	{
		Collection<String> nomes= new ArrayList();
		
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Mariana");
		nomes.add("Milton");
		
		Collection<String> nomes2 = Arrays.asList("João", "Joana");
		nomes.addAll(nomes2);
		System.out.println("Lista de nomes: "+nomes);
		
		System.out.println("\n");
		
		for(String name : nomes)
		{
			System.out.println("Lista de nomes: "+name);
		}
		 
		//testando contains
		/*System.out.println("Contem o nome Maria ? "+nomes.contains("Maria")); //true
		System.out.println("Lista "+nomes);*/
		
		//testando comando clear
		/*System.out.println("Lista de nomes: "+nomes);
		nomes.clear();
		System.out.println("Lista de nomes: "+nomes);*/
		
		//testando remove
		/*System.out.println("Lista de nomes: "+nomes);
		
		nomes.remove("Mario");
		
		System.out.println("Lista de nomes: "+nomes);*/
		
		//testando função de vazio
		/*if(nomes.isEmpty())
		{
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println("Lista de nomes: "+nomes);
		}*/
		
	}

}
