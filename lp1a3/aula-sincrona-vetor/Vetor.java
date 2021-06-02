import java.util.Random;

public class Vetor {
	
	int[] elementos;

	public Vetor(int tamanho) {
		elementos = new int[tamanho];
		
		Random num = new Random();
		
		for(int i = 0; i < tamanho; i++) {
			elementos[i] = num.nextInt(100);
		}
	}
	
	public String getElementos() {
		String vetoresGerados = "";
		
		for(int elemento: elementos) {
			vetoresGerados += elemento + " ";
		}
		return vetoresGerados;		
	}
	
	public int somaElementos() {
		int soma = 0;
		
		for(int i=0; i < this.elementos.length; i ++) {
			soma += elementos[i];
		}		
		return soma;
	}
	
	public float mediaElementos() {
		return this.somaElementos()/(float)this.elementos.length;
	}
	
	public int ultimoElemento() {
		return this.elementos[this.elementos.length - 1];
	}
	
	public int maiorElemento() {
		
		int maior = this.elementos[0];
		
		for(int i=1; i<this.elementos.length; i++) {
			if(this.elementos[i] > maior)
				maior = this.elementos[i];
		}
		
		return maior;
	}
	
	public boolean buscaElemento(int num) {
		
		for(int elemento: elementos) {
			if(elemento == num)
				return true;
		}
		return false;
	}
}
