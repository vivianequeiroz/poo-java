public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
        	  metodo2();
        } catch(ArithmeticException | NullPointerException | MinhaException ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        } 
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        // ArithmeticException exception = new ArithmeticException("houve um erro :(");
        throw new MinhaException("houve um erro :(");
       
        //System.out.println("Fim do metodo2");
    }
}