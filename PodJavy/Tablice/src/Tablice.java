import java.util.Scanner;

public class Tablice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] imiona=new String[5];
		Scanner odczyt=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Podaj imie: ");
			imiona[i]=odczyt.nextLine();
			System.out.println("Witaj "+imiona[i]);
		}
		odczyt.close();
	}

}
