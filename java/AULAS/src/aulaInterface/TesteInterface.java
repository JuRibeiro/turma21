package aulaInterface;

public class TesteInterface 
{
	public static void main (String args[])
	{
		ParticipanteForum participante = new ParticipanteForum();
		Leitor leitor = participante;	
		
		System.out.println("O Participante esta lendo: "+leitor.lendo());
		
		Programadore programadore = participante;
		
		String java = "JAVA";
		programadore.pensando(java.toCharArray());
		System.out.println("E programando "+programadore.digitando());
	}
	
}
