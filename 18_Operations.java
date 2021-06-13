package ArithmeticOperations;

public class Addition {
int a,b;
	public int getNum(int a,int b)
	{
		this.a=a;
		this.b=b;
		return (a+b);
	}
}

public class Subtraction {
	int a,b;
	public int getNum(int a,int b)
	{
		this.a=a;
		this.b=b;
		return (a-b);
}}
public class Multiplication {
	int a,b;
	public int getNum(int a,int b)
	{
		this.a=a;
		this.b=b;
		return (a*b);
}}public class Division {
	int a,b;
	public int getNum(int a,int b)
	{
		this.a=a;
		this.b=b;
		return (a/b);
}}

import java.util.Scanner;

import ArithmeticOperations.*;

public class Operations {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Arithmetic Operations");
		System.out.println("Enter a and b : ");
		a=s.nextInt();
		b=s.nextInt();
		Addition add=new Addition();
		Subtraction sub=new Subtraction();
		Multiplication mul=new Multiplication();
		Division div=new Division();
		System.out.println("Addition of a and b : "+add.getNum(a, b));
		System.out.println("Subtraction of a and b : "+sub.getNum(a, b));
		System.out.println("Multiplication of a and b : "+mul.getNum(a, b));
		System.out.println("Division of a and b : "+div.getNum(a, b));
	}

}
