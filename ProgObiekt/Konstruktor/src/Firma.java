
public class Firma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker1=new Worker();
		Worker worker2=new Worker("Jan","Kowalski",34);
		Worker worker3=new Worker(worker1);
		
		System.out.println(worker1.name+" "+worker1.lastName+" "+worker1.age);
		System.out.println(worker2.name+" "+worker2.lastName+" "+worker2.age);
		System.out.println(worker3.name+" "+worker3.lastName+" "+worker3.age);
	}

}
