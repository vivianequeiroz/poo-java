
public class Pessoa {
	public String cpf;
	public String nome; 
	
	public Pessoa(String _cpf, String _nome) {
		cpf = _cpf;
		nome = _nome;
		
		System.out.printf("O nome da pessoa cadastrada no sistema é: %s \n", nome);
		System.out.printf("O CPF dela é: %s  \n", cpf);
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
