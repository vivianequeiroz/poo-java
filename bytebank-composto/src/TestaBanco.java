public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente viviane = new Cliente();
		viviane.nome = "Viviane Queiroz";
		viviane.cpf = "111.111.111-11";
		viviane.profissao = "Programadora";
		
		Conta contaDaViviane = new Conta();
		contaDaViviane.deposita(100);
		
		contaDaViviane.titular = viviane;
		
		System.out.println(contaDaViviane.titular.nome);
	}
}
