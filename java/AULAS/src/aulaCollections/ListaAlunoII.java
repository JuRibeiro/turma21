package aulaCollections;

import java.util.HashSet;
import java.util.Set;

public class ListaAlunoII 
{
	public static void main(String[] args) 
	{
		//estudar esse instanciamento
		Set<AlunoII> conjunto = new HashSet<AlunoII>();
		
		AlunoII a = new AlunoII ("Joao", "java", 6.9);
		AlunoII b = new AlunoII ("Juliana", "java", 10);
		AlunoII c = new AlunoII ("Joana", "java", 9.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		
		System.out.println(conjunto);
		
	}

}
