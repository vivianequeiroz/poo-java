import java.util.Scanner;

public class SomaDe1AN {

	public static void main(String[] args) {
		
		int number;
		int sum = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		number = scanner.nextInt();
	    
	    for (int i = 0; i <= number; i++) {
	        sum += i;
	    }
	    
	    System.out.printf("A soma de 1 até " + number + " é igual a " + sum + ".");
	 }
}
