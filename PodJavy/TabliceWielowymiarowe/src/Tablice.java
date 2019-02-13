
public class Tablice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tab= {{0,1,2},{3,4,5}};
		
		for(int i=0;i<tab.length;i++) {
			for(int j=0;j<tab[i].length;j++)
				System.out.println("tab["+i+","+j+"]= "+tab[i][j]+";");
		}
	}

}
