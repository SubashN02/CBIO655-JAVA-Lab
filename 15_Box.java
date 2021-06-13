

import java.util.Scanner;

public class Box {

	int height,width,depth;

	public void box()
	{
		height=100;
		width=20;
		depth=5;
	}
	public void SetBoxVolume(int height,int width,int depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	public int GetBoxVolume()
	{
		return (height*width*depth);
	}

	public static void main(String[] args) {
		int height,width,depth;
		Scanner s=new Scanner(System.in);
		System.out.println("Calculation of Box Volume");
		System.out.println("Enter height : ");
		height=s.nextInt();
		System.out.println("Enter width : ");
		width=s.nextInt();
		System.out.println("Enter depth : ");
		depth=s.nextInt();

		Box b=new Box();
		b.SetBoxVolume(height,width,depth);
		System.out.println("Volume of the box : "+b.GetBoxVolume());
	}

}
