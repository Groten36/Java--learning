import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class Binarne {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		RandomAccessFile strumien=null;
		int bajty=0;
		
		
		try {
			strumien=new RandomAccessFile("binarne.txt","rw");
		}catch(FileNotFoundException e) {
			System.out.println("Niez naleziono pliku");}
		
	
	
	
		try {
			String imie="Adam";
			int rok=2019;
			double dziel=50/4;
			
			strumien=new RandomAccessFile("binarne.txt","rw");
			while(strumien.read()!=-1) {
				strumien.writeUTF(imie);
				strumien.writeInt(rok);
				strumien.writeDouble(dziel);
				bajty++;
			}
			}catch(IOException e) {
		
			System.out.println("Blad wejscia-wyjscia");
		}
		
		try {
			strumien.close();
		}catch(IOException e) {
			System.out.println("Blad zamykania strumienia");
		}
		
		System.out.println("Zczytano: "+bajty+" bajtow");

}}
