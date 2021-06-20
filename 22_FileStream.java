

import java.io.*;

public class FileStream {

	public static void main(String[] args) throws IOException {
File input=new File("Subash.txt");
File output=new File("Subashout.txt");
FileInputStream fis=new FileInputStream(input);
FileOutputStream fos=new FileOutputStream(output);
int a;
while(((a=fis.read())!=-1))
{
	fos.write(a);
}
System.out.println("Done!");
fis.close();
fos.close();
	}

}
