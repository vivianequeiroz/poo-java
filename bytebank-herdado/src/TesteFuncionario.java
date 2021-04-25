
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario joao = new Funcionario();
		
		joao.setNome("Joao Bispo");
		joao.setCpf("12345678-9");
		joao.setSalario(343345.23);
		
		System.out.println(joao.getNome());
		System.out.println(joao.getBonificacao());
	}
}
