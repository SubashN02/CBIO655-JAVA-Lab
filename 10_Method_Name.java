
import java.util.Scanner;

public class Method_Name {

	static void name(String fname) {
		System.out.println(fname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter Your name :");
		Scanner s=new Scanner(System.in);
		String fname=s.nextLine();
		System.out.println("How many times you wish to display your name : ");
		n=s.nextInt();
		System.out.println("Your Name :");
		for(int i=0;i<n;i++)
		{
			name(fname);
		}}

}
