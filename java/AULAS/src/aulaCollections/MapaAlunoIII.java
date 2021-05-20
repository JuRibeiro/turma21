package aulaCollections;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAlunoIII 
{
	public static void main(String[] args) 
	{
		Map<String, AlunoII> mapa = new TreeMap<String, AlunoII>();
		
		AlunoII a = new AlunoII ("Joao", "java", 6.9);
		AlunoII b = new AlunoII ("Juliana", "java", 10);
		AlunoII c = new AlunoII ("Joana", "java", 9.5);
		
		mapa.put("João", a);
		mapa.put("Juliana", b);
		mapa.put("Joana", c);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Juliana")); //chave
		
		Collection<AlunoII> alunos = mapa.values();
		for (AlunoII e: alunos)
		{
			System.out.println(e);
		}
		
	}

}
