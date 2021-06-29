public class TesteConexao {
    public static void main(String[] args) {
    	
    	

    	try(Conexao conexao = new Conexao()) {
    		conexao.leDados();
    	} catch(IllegalStateException ex) {
    		System.out.println("Ocorreu um erro na conexão :(");
    	}
    }
}	
    	
    	
//    	
//    	Conexao conex = null;
//    	try {
//    		conex = new Conexao();
//    		conex.leDados();
//    	} catch(IllegalStateException ex){
//    		System.out.println("Ocorreu um erro na conexão :(");
//    	} finally {
//    		conex.close();
//    	}
//    }


// Try - obrigatório
// Catch - não obrigatório, pode haver mais de 1
// finally - único, pode ser usado após bloco catch ou try
// try {
//     conex = new Conexao();
//     conex.leDados();
// } finally {
//     conex.fecha();
// }