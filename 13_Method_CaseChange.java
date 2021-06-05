

import java.util.Scanner;

public class Method_CaseChange {

	static String[] casechanger(String name){
		String newname="";		
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			if(Character.isUpperCase(c))
			{
				c=Character.toLowerCase(c);
				newname=newname+c;
			}
			else if(Character.isLowerCase(c))
			{
				c=Character.toUpperCase(c);
				newname=newname+c;
			}

		}
		String[] arr = new String[2];
		arr[0] = newname;
		arr[1] = name;
		return arr;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name=s.nextLine();
		String[] arr1=casechanger(name);
		System.out.println("Case Changed : "+arr1[0]);
		System.out.println("Case Unchanged : "+ arr1[1]);

	}
}
