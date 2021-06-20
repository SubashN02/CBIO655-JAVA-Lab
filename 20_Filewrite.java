

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("Subash.txt");
		String s="Hi! I am SUBASH N";
		for(int i=0;i<s.length();i++) {
			fw.write(s.charAt(i));
		}
		System.out.println("Done!");
		fw.close();
	}

}
