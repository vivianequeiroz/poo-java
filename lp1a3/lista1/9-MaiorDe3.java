import java.util.Random;

public class MaiorDe3 {

		public static void main(String[] args) {
		
		int[] numbers = new int[3];
		int biggest = 0;
		
		Random randomNumber = new Random();
		numbers[0] = randomNumber.nextInt(10);
		
		numbers[1] = randomNumber.nextInt(10);
		
		numbers[2] = randomNumber.nextInt(10);
		
		for(int number : numbers) {
			System.out.println("Número aleatório gerado (entre 0 e 10): " + number);
		}
		
		for(int i = 0; i < 3; i++) {
			if(numbers[i] > biggest) {
				biggest += numbers[i];
			}
		}
		
		System.out.println("O maior número dentre esses é: " + biggest + ".");
	}
}
