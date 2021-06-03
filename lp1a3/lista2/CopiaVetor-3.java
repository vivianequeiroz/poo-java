public class CopiaVetor {

	public static void main(String[] args) {
		
		int[] vet1 = new int[5];
		int[] vet2 = new int[5];
		
		System.out.println("Abaixo, digite 5 números: ");
		
		Scanner scanner = new Scanner(System.in); 	
		
		for(int i = 0; i < vet1.length; i++) { 
			System.out.print("-  ");  
			vet1[i] = scanner.nextInt(); 
		}
		
		vet2 = vet1;
		
		
		System.out.println("Seguem os números inseridos no vet1: ");
		
		for(int vet: vet1) {
			System.out.println("-  " + vet);
		}
		
		System.out.println("Seguem os números inseridos no vet2: ");

		for(int vet: vet2) {
			System.out.println("-  " + vet);
		}
		
		}
}
