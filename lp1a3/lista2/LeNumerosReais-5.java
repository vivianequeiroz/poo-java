import java.io.IOException;
import java.util.Scanner;

class LeNumerosReais {
	
    public static void main(String[] args) throws IOException {
    	
        double[] vetNumbers = new double[20];
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Digite abaixo 20 números reais: ");
        
    	
    	for(int i = 0; i < vetNumbers.length; i++) { 
			System.out.print("-  ");  
			vetNumbers[i] = Double.parseDouble(scanner.nextLine());
		}
        
        System.out.println("Os números reais digitados foram: ");
        
        for(double number : vetNumbers) {
        	System.out.println("- " + number);
        }
    }
}