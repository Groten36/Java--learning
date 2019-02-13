
public class Worker {
	String name;
	String lastName;
	int age;
	
	public Worker() {
		this.name="Magda";
		this.lastName="Ciezka";
		this.age=21;
	}
	public Worker(String name, String lastName, int age) {
		this.name=name;
		this.lastName=lastName;
		this.age=age;
	}
	
	public Worker(Worker worker) {
		this.name=worker.name;
		this.lastName=worker.lastName;
		this.age=worker.age;
	}

}
