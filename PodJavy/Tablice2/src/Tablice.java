import java.util.Scanner;

public class Tablice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner odczyt=new Scanner(System.in);
		System.out.println("Podaj wielkosc tablicy");
		int n=odczyt.nextInt();
		
		int[] tab=new int[n];
		int i=0;
		while(i<n){
			tab[i]=i+1;
			System.out.println(tab[i]);
			i++;
		}
		odczyt.close();
	}

}
