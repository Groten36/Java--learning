
public class Firma {

	//Pracownik pracownik1= new Pracownik("Magda","Ciezka",21);
	//Pracownik pracownik2=new Pracownik("Jan","Kowalski",32);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] imiona= {"Magda","Jan","Piotr"};
		String[] nazwiska= {"Ciezka","Kowalski","Nowak"};
		int[] wiek= {21,34,56};
		
		Pracownik[] pracownicy=new Pracownik[3];
		
		System.out.println("Pracownicy firmy to:");
		for(int i=0;i<3;i++) {
			pracownicy[i]=new Pracownik(imiona[i],nazwiska[i],wiek[i]);
			System.out.println(pracownicy[i].imie+" "+pracownicy[i].nazwisko+" "+pracownicy[i].wiek);
		}
	}

}
