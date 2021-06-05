

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int rem,n,num,count=0,res=0;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		n=num;
		count=String.valueOf(n).length();		 
		while(n!=0)
		{
			rem=n%10;
			res+=Math.pow(rem,count);
			n/=10;
		}
		if(res==num)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}

	}

}
