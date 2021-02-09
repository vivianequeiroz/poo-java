
public class Servico {
	
	private int codigo;
	private String nome;
	private double valor;
	
	public Servico(String _nome, int cod, double _valor) {
		codigo = cod;
		nome = _nome;
		valor = _valor;
		
		System.out.printf("\nO serviço contratado de %s", _nome);
		System.out.println(" tem o código no sistema: " + cod);
		System.out.println("O valor dele é: " + _valor);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
