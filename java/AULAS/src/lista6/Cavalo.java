package lista6;

public class Cavalo extends Animal
{
	//atributos
		private char animalCorre;
		
		//construtores
		public Cavalo(String nome, int idade, boolean emiteSom, char animalCorre)
		{
			super(nome, idade, emiteSom);
			this.animalCorre = animalCorre;
		}
		
		//encapsulamento
		public char isAnimalCorre() {
			return animalCorre;
		}

		public void setAnimalCorre(char animalCorre) {
			this.animalCorre = animalCorre;
		}
}
