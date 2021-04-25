
public class Pessoa {
	public String cpf;
	public static String nome; 
	
	public Pessoa(String _cpf, String _nome) {
		this.cpf = _cpf;
		this.nome = _nome;
		
		System.out.println("-----------------------------------------------------");
		System.out.printf("O nome da pessoa cadastrada no sistema é: %s \n", nome);
	}


	public Pessoa(String string) { }


	public String toString() {
		return String.format("%s %s", cpf, nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
