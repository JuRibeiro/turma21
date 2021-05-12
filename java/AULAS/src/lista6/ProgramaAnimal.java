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
		
		
		System.out.println("ANIMAL 1");
		System.out.printf("Com qual animal iremos trabalhar agora? ");
		System.out.printf(horse1.getNome());
		
		System.out.printf("\nQual idade deste animal? ");
		System.out.print(horse1.getIdade());
		System.out.println();

		
		System.out.println("\n\n");
		System.out.println("ANIMAL 2");
		System.out.printf("Com qual animal iremos trabalhar agora? ");
		System.out.printf(dog1.getNome());
		
		System.out.printf("\nQual idade deste animal? ");
		System.out.print(dog1.getIdade());
		System.out.println();
		
		
		System.out.println("\n\n");
		System.out.println("ANIMAL 3");
		System.out.printf("Com qual animal iremos trabalhar agora? ");
		System.out.println(preguica1.getNome());
		
		System.out.printf("Qual idade deste animal? ");
		System.out.print(preguica1.getIdade());
		
		//System.out.printf("\nEste animal sobe em arvores? ");
		
		System.out.println("\n\n");
		System.out.println("SOM DOS ANIMAIS");
		System.out.println("\n");
		
		horse1.setSom("iiirrrrí");
		dog1.setSom("au au au auuuuuuuuu");
		preguica1.setSom("este não faz barulho");
		
		
		Animal[] animalzinho = new Animal[3];  //vetor indica duas posições PJ e PF
		
		animalzinho[0] = horse1;
		animalzinho[1] = dog1;
		animalzinho[2] = preguica1;
		
		for (Animal animal:animalzinho)    //pessoa : indica -passar por todas as posições de vetores
		{
			System.out.println(animal.getSom());
		}
		
		System.out.println();
		System.out.println("Agora reflita que animais são estes");
		System.out.println();
		System.out.println("Que animal faz: iiirrrrí?  ");
		System.out.println("Que animal faz: au au au auuuuuuuuu?  ");
		System.out.println("Que animal não faz nenhum barulho?  ");
		
		
	}

}
