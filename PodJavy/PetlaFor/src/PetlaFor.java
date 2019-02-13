import java.util.Scanner;

public class PetlaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner odczyt= new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int liczba=odczyt.nextInt();
		System.out.println("Bomba wybuchnie za ");
		for(int i=0;i<=liczba;i++) {
			System.out.println(liczba-i);
		}
		
		odczyt.close();
	}

}
