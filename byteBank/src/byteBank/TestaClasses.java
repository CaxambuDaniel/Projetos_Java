package byteBank;

public class TestaClasses {
	public static void main(String[] args) {

		Funcionario daniel = new Gerente();
		
		daniel.setNome("Daniel Carvalho de Souza");
		daniel.setSalario(0);
		
		Funcionario pedro = new Funcionario();
		pedro.setSalario(100);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(pedro);
		controle.registra(daniel);
		
		System.out.println(controle.getSoma());
		
		

	}
}
