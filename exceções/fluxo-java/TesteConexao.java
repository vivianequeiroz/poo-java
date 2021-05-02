public class TesteConexao {
    public static void main(String[] args) {
    	
    	Conexao conex = null;
    	try {
    		conex = new Conexao();
    		conex.leDados();
    	} catch(IllegalStateException ex){
    		System.out.println("Ocorreu um erro na conexão :(");
    	} finally {
    		conex.fecha();
    	}
    }
}