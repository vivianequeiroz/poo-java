import java.util.Random;

public class DivisivelPor3E5 {

	public static void main(String[] args) {
		
		int number; 
		
		Random randomNumber = new Random();
		
		number = randomNumber.nextInt(100);
		
		if((number % 3) == 0 && (number % 5) == 0) {
			System.out.println("O número " + number + " é divisível por 5 e 3 =)");
		} else {
			System.out.println("O número " + number + " não é divisível por 5 e por 3 =(");
		}	
	}
}