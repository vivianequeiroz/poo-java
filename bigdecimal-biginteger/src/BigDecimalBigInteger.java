import java.math.BigDecimal;
import java.math.BigInteger;

// classes used to accurated results with float and big numbers 
public class BigDecimalBigInteger {

	public static void main(String[] args) {
		
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c);
		
		BigDecimal _a = new BigDecimal("0.03");
		BigDecimal _b = new BigDecimal("0.04");
		BigDecimal _c = _b.subtract(_a);
		System.out.println(_c);
		
		BigDecimal bd1 = new BigDecimal("453424646756.563453453");
		BigDecimal bd2 = new BigDecimal("970697039043823.5634523");
		
		System.out.println(bd1.multiply(bd2));
		
		System.out.println(bd1.divide(new BigDecimal(2)));
		// if we divide for a specific number it need to be instantiated
		
		BigInteger bi = new BigInteger("100000000000000000000000000000");
		System.out.println(bi);
	}
}
