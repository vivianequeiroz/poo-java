
public class MainTesteVetor {
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(5);
		
		int num = 10;
		
		System.out.println("Vetor: " + vetor.getElementos());
		System.out.println("Soma dos elementos do vetor: " + vetor.somaElementos());
		System.out.println("Média dos elementos do vetor: " + vetor.mediaElementos());
		System.out.println("Último elemento do vetor: " + vetor.ultimoElemento());
		System.out.println("Maior elemento do vetor: " + vetor.maiorElemento());
		System.out.println("Maior elemento do vetor: " + vetor.maiorElemento());
		System.out.println("Número "+num+ " existe no vetor: " + vetor.buscaElemento(num));
	}
}
