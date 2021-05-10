package programacaoOrientadaAObjetos;

public class TestandoFuncionario {

	public static void main(String[] args) 
	{
		Funcionario func = new Funcionario();
		
		//parametros
		//set
		func.setNome("Juliana");
		func.setSalario(2500);
		
		//get
		System.out.println(func.getNome());
		System.out.println(func.getSalario());

	}

}
