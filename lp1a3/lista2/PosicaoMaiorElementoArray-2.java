import java.util.Scanner;

	public class PosicaoMaiorElementoArray2 {
		
		public static void main(String[] args) {
			
			int[] numbers = new int[8];
			int biggest = 0;
			
			System.out.println("Abaixo, digite 8 números: ");
			
			Scanner scanner = new Scanner(System.in); 	
			
			for(int i = 0; i < numbers.length; i++) { 
				System.out.print("-  ");  
				numbers[i] = scanner.nextInt(); 
			}
			
			for(int i = 0; i < 8; i++) {
				if(numbers[i] > biggest) {
					biggest = numbers[i];
				}
			}
			
			
			System.out.println("O maior elemento é o número: " + biggest + ". ");
			System.out.println("A sua posição dentro do array é igual: " + (biggest - 1) + ". ");

			}
}
