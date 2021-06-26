
  public class DataHora { 

    public static void main(String[] args) { 
    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
    Date data = fmt.parse("25/06/2021 19:30:20"); 
    String str = fmt.format(data); 
    }
  }