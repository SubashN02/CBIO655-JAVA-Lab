
public class Fib {
	public static void main(String[] args) {
		long a=0,b=1,c;
		System.out.println(a+"\n"+b);
		for(int i=2;i<50;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
