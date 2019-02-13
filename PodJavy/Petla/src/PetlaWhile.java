import java.util.Scanner;

public class PetlaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner odczyt= new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int liczba=odczyt.nextInt();
		int i=0;
		System.out.println("Bomba wybuchnie za ");
		while(i<=liczba) {
			System.out.println(liczba-i);
			i++;
		}
		odczyt.close();
	}

}
