package lista6;


public class ProgramaAnimal {

	public static void main(String[] args) 
	{	//rever este codigo
		/*Animal Cavalo = new Cavalo ("Cavalo",20 );
		Animal Cachorro = new Cachorro ("Cachorro", 5);
		Animal Preguica = new Preguica ("Preguiça", 40);*/
		
		Cachorro dog1 = new Cachorro ("Djalma", 5);
		Cavalo horse1 = new Cavalo ("Mito", 6);
		Preguica preguica1 = new Preguica ("Joséfina", 23);
		Caseiro dog2 = new Caseiro ("Titã", 4, "grande", 'M');
		
		
		System.out.println("ANIMAL 1");
		System.out.printf("Com qual animal iremos trabalhar agora? ");
		System.out.printf(horse1.getNome());
		
		System.out.printf("\nQual idade deste animal? ");
		System.out.print(horse1.getIdade());
		System.out.println();
		horse1.som();
		
		System.out.println("\n\n");
		System.out.println("ANIMAL 2");
		System.out.printf("Com qual animal iremos trabalhar agora? ");
		System.out.printf(dog1.getNome());
		
		System.out.printf("\nQual idade deste animal? ");
		System.out.print(dog1.getIdade());
		System.out.println();
		dog1.som();
		dog2.som();
		
		System.out.println("\n\n");
		System.out.println("ANIMAL 3");
		System.out.printf("Com qual animal iremos trabalhar agora? ");
		System.out.println(preguica1.getNome());
		
		System.out.printf("Qual idade deste animal? ");
		System.out.print(preguica1.getIdade());
		
		System.out.printf("\nEste animal sobe em arvores? ");
		
		
		
		
	}

}
