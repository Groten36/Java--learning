import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pliki {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner odczyt=new Scanner(System.in);
			System.out.println("Podaj imie: ");
			String imie=odczyt.nextLine();
		
			PrintWriter zapisPliku = new PrintWriter("plik.txt");
			zapisPliku.println(imie);
		
			zapisPliku.close();
			odczyt.close();
		
		
			Scanner odczytPliku = new Scanner(new File("plik.txt"));
		
			System.out.println(odczytPliku.nextLine());
			
			odczytPliku.close();
			
		
		}	
}

