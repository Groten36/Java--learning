import java.util.Scanner;

public class Wejscie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		
		Scanner odczyt=new Scanner(System.in);
		
		System.out.print("Podaj liczbe: ");
		a= odczyt.nextDouble();
		System.out.print("Podaj liczbe: ");
		b=  odczyt.nextDouble();
		
		System.out.print("a+b:"+(a+b)+"\n");
		System.out.print("a-b:"+(a-b)+"\n");
		System.out.print("a*b:"+(a*b)+"\n");
		System.out.print("a/b:"+(a/b)+"\n");
		
		odczyt.close();
	}

}
