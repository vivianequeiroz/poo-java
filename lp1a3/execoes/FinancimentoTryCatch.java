public class FinanciamentoTryCatch {
     
    public Double valorTotal;
    public Double entrada;
    public Integer parcelas;

    public FinanciamentoTryCatch(Double valorTotal, Double entrada, Integer parcelas) {
      
      if (entrada < valorTotal * 0.2) {
        System.out.println("Entrada mínima de 20% requerida.");
      }
      else if (parcelas < 6) { 
        System.out.println("Numero de parcelas mínimos: 6.")
      }
      
      this.valorTotal = valorTotal;
      this.entrada = entrada;
      this.parcelas = parcelas;
    }

    public double prestacao() {
      return (valorTotal - entrada) / parcelas;
    }
}