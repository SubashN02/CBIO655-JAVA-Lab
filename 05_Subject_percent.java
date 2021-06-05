

public class Subject_percent {
	public static void main(String[] args) {
		int english,tamil,maths,science,social,total;
		float perc;
		english=78;
		tamil=89;
		maths=67;
		science=67;
		social=88;
		total=(english+tamil+maths+science+social);
		perc=(total/5);
		if(perc>50)
		{
			System.out.println("Pass");
		}	
		else
		{
			System.out.println("Fail");
		}
	}
}
