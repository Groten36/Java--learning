import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarne {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub\
		DataInputStream strumienWejscia=null;
		DataOutputStream strumienWyjscia=null;
		try{
			strumienWejscia = new DataInputStream(new FileInputStream("binarne2.txt"));
			strumienWyjscia= new DataOutputStream(new FileOutputStream("przekopiowane.txt"));
			}catch(FileNotFoundException e) {
				System.out.println("Brak pliku");
			}
		byte[] bufor=new byte[1024];
		int sczytaneBajty=0;
		int bajty=0;
		try {
			while((sczytaneBajty=strumienWejscia.read(bufor))!=-1) {
				strumienWyjscia.write(bufor,0,sczytaneBajty);
				bajty+=sczytaneBajty;
			}
		}catch(IOException e) {
			System.out.println("Blad wejscia-wyjscia");
		}
		
		try {
			strumienWejscia.close();
			strumienWejscia.close();
		}catch(IOException e) {
			System.out.println("Blad zamykania strumienia");
		}
		System.out.println("Sczytane Bajty: "+bajty);
	}

}
