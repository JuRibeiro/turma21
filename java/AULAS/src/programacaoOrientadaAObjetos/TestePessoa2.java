package programacaoOrientadaAObjetos;

public class TestePessoa2 {

	public static void main(String[] args) 
	{
		//instanciando os objetos da classe
		Pessoa2 Jessica = new Pessoa2 ("Jessica", 555);
		Funcionario2 Pedro = new Funcionario2 ("Pedro", 222, "TI");
		Pessoa2 Maria = new Funcionario2 ("Maria", 333, "informatica");
		Pessoa2 José = new Coordenador2("José", 444, "Gestão de TI");
		
		System.out.println(Jessica.getMatricula());
		System.out.println(Pedro.getDepartamento());
		System.out.println(Maria.getMatricula());
		System.out.println(José.getNome());

	}

}
