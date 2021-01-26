
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		System.out.println(contaDoJoao.getSaldo());
		// a new method (pegaSaldo) invoked invoked
		// to access the saldo due to the addition of "private" in the class Conta attributes
		
		contaDoJoao.titular = new Cliente();
		System.out.println(contaDoJoao.titular);
		
		contaDoJoao.titular.nome = "Joao";
		System.out.println(contaDoJoao.titular.nome);
	}	
}
