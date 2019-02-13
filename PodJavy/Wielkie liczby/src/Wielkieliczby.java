import java.math.BigInteger;

public class Wielkieliczby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a= new BigInteger("-12345677657897867456780");
		BigInteger b=new BigInteger("1234567898765433456765432345");
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
		
		System.out.println(a.pow(2));
		System.out.println(a.abs());
		
	}

}
