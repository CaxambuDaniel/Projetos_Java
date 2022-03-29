package pilha;

public class TestaConexao {

	public static void main(String[] args) {
		
		Conexao con = null;		
		try {
			con = new Conexao();
			con.leDados();
		} catch (Exception e) {
			System.out.println("Deu Ruim na conexão");
		} finally {
			con.fecha();
		}
		

	}

}
