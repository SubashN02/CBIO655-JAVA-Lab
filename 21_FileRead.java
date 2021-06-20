

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		int a;
		FileReader fr=new FileReader("Subash.txt");
		while(((a=fr.read())!=-1))
		{
			System.out.print((char)a);
		}
		
		fr.close();
	}

}
