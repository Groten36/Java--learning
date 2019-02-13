import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner odczyt=new Scanner(System.in);
		
		System.out.println("Podaj imie: ");
		String imie=odczyt.nextLine();
		
		if("Magda".equals(imie))
			System.out.println("Czesc "+imie+"!");
		else if("Pawel".equals(imie))
			System.out.println("Czesc "+imie+"!");
		else
			System.out.println("Przykro mi, nie znam Cie!");
		odczyt.close();
	}

}
