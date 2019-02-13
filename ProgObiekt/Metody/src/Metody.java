
public class Metody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punkt punkt=new Punkt(5,5);
		punkt.printPoint();
		System.out.println(punkt.jedeX()+ " "+punkt.jedeY());
		punkt.printPoint();
		System.out.println(punkt.incX(5)+ " "+punkt.incY(5));
		punkt.printPoint();
		System.out.println(punkt.getX()+" "+punkt.getY());
		punkt.printPoint();
	}

}
