import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner odczyt=new Scanner(System.in);
		
		System.out.println("Podaj liczbe a:");
		int a=odczyt.nextInt();
		System.out.println("Podaj liczne b:");
		int b=odczyt.nextInt();
		
		if(a>b)
			System.out.println("Liczna a jest wieksza");
		else if(a<b)
			System.out.println("Liczba b jest wieksza");
		else
			System.out.println("Liczby sa rowne");
					
		odczyt.close();
	}

}
