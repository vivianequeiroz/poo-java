
public class MinhaException extends Exception {

    public MinhaException(String msg) {
        super(msg);
    }
}

// Exception é a classe mãe de RuntimeException **
// checked indica que a exception precisa ser explicíta na assinatura do método OU resolvida pelo try catch
// unchecked indica que o - compilador - não precisa fazer uma verificação da exception a ser lançada