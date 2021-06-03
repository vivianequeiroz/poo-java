import java.util.Scanner;

public class PreencheArray1 {

	public static void main(String[] args) {
			
		int[] numbers = new int[10];
		
		System.out.println("Abaixo, digite 10 números: ");
		
		Scanner scanner = new Scanner(System.in); 	
		
		for(int i = 0; i < numbers.length; i++) { 
			System.out.print("-  ");  
			numbers[i] = scanner.nextInt(); 
		}
		
		System.out.println("Seguem os números inseridos: ");
		
		for(int number: numbers) {
			System.out.println("-  " + number);
		}

		}
}
