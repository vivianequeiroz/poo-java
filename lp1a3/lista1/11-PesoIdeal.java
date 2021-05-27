import java.util.Scanner; 

class PesoIdeal {
  public static void main(String[] args) {
    
    float height;
    int gender;
    
    Scanner scanner = new Scanner(System.in); 

    System.out.print("Digite sua altura: ");
    height = scanner.nextFloat();

    System.out.print("Digite o seu genero (0 para homem e 1 para mulher): ");
    gender = scanner.nextInt();

    if(gender == 0 ) {
      System.out.printf("O seu peso ideal é " + ((height * 72.7) - 58));
    }

    if(gender == 1 ) {
      System.out.printf("O seu peso ideal é "+ ((height * 62.1) - 44.7));
    }
  }
}