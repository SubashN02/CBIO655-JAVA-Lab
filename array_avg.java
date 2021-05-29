
public class array_avg {

	public static void main(String[] args) {
		double arr1[]= {1,2,3,4,5,6,7,8,9,10},arr2[]= {11,12,13,14,15,16,17,18,19,20},sum=0,sum1=0,avg=0;
		for(int i=0;i<10;i++)
		{
			sum=sum+arr1[i];
			sum1=sum1+arr2[i];
		}
		avg=((sum+sum1)/20);
		System.out.println("Average of 2 given arrays:" +avg);
	}
}
