

import java.util.*;
public class Method_NameReverse {

	static void NameReverse(String fname)
	{
		char[] rev;
		rev=fname.toCharArray();
		for(int i=rev.length-1;i>=0;i--)
		{
			System.out.print(rev[i]);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String fname;
		System.out.println("Enter a name :");
		fname=s.nextLine();
		System.out.println("Entered Name in reverse : ");
		NameReverse(fname);
	}

}
