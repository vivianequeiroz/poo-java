import java.util.Random;

public class PositivoNegativoDivisivelPor3 {
	
	public static void main(String[] args) {
			
			int number; 
			
			Random randomNumber = new Random();
			
			number = randomNumber.nextInt(10);
			
			System.out.println("Número aleatório gerado(de 0 a 10) =  "+ number + ".");
			
			if(number >= 0) {
				System.out.println("O número é positivo.");
			} else {
				System.out.println("O número é negativo.");
			} if((number % 3 == 0)) {
				System.out.println("E divisível por 3.");
			} else {
				System.out.println("E não divisível por 3.");
			}
		}

}
