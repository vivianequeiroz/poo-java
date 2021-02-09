
public class Cliente {
	private String telefone;
	
	public Cliente(String tel) {
		telefone = tel;
		
		System.out.printf("O telefone do cliente é: %s", this);
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
