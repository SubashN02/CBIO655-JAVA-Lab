
import java.util.Scanner;

public class DNA_Length {

	public static void main(String[] args) {
		int len1,len2;
		System.out.println("Enter DNA Sequence 1: ");
		Scanner s=new Scanner(System.in);
		String dna1=s.nextLine();
		System.out.println("Enter DNA Sequence 2: ");
		String dna2=s.nextLine();
		len1=dna1.length();
		len2=dna2.length();
		if(len1==len2)
		{
			System.out.println("Entered 2 DNA Sequences are in same length");
		}
		else {
			System.out.println("Entered 2 DNA Sequences are not in same length");
		}
	}

}
