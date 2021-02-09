
public class Cliente extends Pessoa {
	private String telefone;
	
	public Cliente(String _cpf, String _nome, String tel) {
		super(_cpf, _nome); 
		telefone = tel;
		
		System.out.println("Consta como >>> cliente <<<");
		System.out.printf("CPF: %s \n", _cpf);
		System.out.printf("O telefone do cliente é: %s", tel);
	}
	
	public String toString() {
		return String.format("%s", telefone);
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
