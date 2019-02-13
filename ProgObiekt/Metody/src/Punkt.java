
public class Punkt {
	int x;
	int y;
	
	
	public Punkt(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int jedeX() {
		return this.x+1;
	}
	
	public int jedeY() {
		return this.y+1;
	}
	
	public int incX(int inc) {
		return this.x+inc;
	}
	
	public int incY(int inc) {
		return this.y+inc;
	}
	
	public int getX() {
		return this.x; 
	}
	
	public int getY() {
		return this.y; 
	}
	
	public void printPoint() {
		System.out.println(this.x+" "+this.y);
	}
}
