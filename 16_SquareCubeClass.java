
class square {
	protected int num;

	public void setSquare(int num)
	{
		this.num=num;
	}
	public int getSquare()
	{
		return num*num;
	}
}
class cube extends square{

	public void setCube(int num)
	{
		setSquare(num);

	}
	public int getCube()
	{
		return getSquare()*num;
	}
}
public class SquareCubeClass {
	public static void main(String[] args) {
		cube c=new cube();
		c.setCube(2);
		System.out.println("Cubic value of 2 is "+c.getCube());
	}
}


