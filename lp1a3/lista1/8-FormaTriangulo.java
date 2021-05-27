import java.util.Scanner;
public class FormaTrinagulo {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		System.out.println("Digite três números para descobrir se formam um triângulo: ");
		
		 Scanner scanner = new Scanner(System.in);
			
			System.out.print("- ");
			a = scanner.nextInt();
			
			System.out.print("- ");
			b = scanner.nextInt();
			
			System.out.print("- ");
			c = scanner.nextInt();
			
		 if ((a + b > c) && (a + c > b) && (b + c > a)) {
			 System.out.print("Esses números formam um triângulo ");
			 if((a == b) && (b == c)) {
				 System.out.println("equilátero.");
			 } else if((a == b && b != c) || ( a == c && c != b ) || (b == c && a !=c )) {
				 System.out.println("isósceles.");
			 } else {
				 System.out.println("escaleno.");
			 }
			 
		 } else {
			 System.out.println("Esses números não formam um triângulo.");
		 }
	}
}