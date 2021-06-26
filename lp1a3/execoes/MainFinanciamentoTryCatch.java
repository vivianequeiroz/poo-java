public class MainFinanciamentoTryCatch {

  public static void main(String[] args) {

    double valorTotal = 1000.0;
    double entrada = 300.0;
    int parcelas = 10;

    try {
      FinanciamentoTryCatch f = new FinanciamentoTryCatch(valorTotal, entrada, parcelas);
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
}
