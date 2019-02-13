package przeciazanie;

public class Glowna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dodawanie dod= new Dodawanie();
		dod.dodaj(1, 1);
		System.out.println(" ");
		System.out.println(dod.dodaj(1, 2, 3));
		System.out.println(dod.dodaj(1, 2, 3,4));
		System.out.println(dod.dodaj(1, 2, 3,4,5));
	}

}
