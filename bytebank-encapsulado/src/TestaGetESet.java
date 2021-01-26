
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 23343);
        // conta.numero = 1234;
		// conta.setNumero(1234);
		System.out.println(conta.getNumero());
		// the methods created implies in a simples code to maintain!
		
		Cliente viviane = new Cliente();
		// conta.titular = viivane;
		viviane.setNome("Viviane Queiroz");
		
		conta.setTitular(viviane);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programadora");
		
		//The same result is achievied with: 
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		// All of them below are the reference to the same cliente 

		System.out.println(titularDaConta);
		System.out.println(viviane);
		System.out.println(conta.getTitular());
	}
	
	
	
	

}
