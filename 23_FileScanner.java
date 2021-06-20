

import java.io.*;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fr=new FileReader("Subash1.txt");
FileWriter fw=new FileWriter("Subashout1.txt");
Scanner s=new Scanner(fr);
int a=0,sum=0,i=0;
for(;s.hasNextInt();i++)
{
	a=s.nextInt();
	fw.write(a+"\n");
	sum=sum+a;
}
System.out.println("Done!");
fw.write("Sum of all integers : "+sum);
fr.close();
fw.close();
	}

}
