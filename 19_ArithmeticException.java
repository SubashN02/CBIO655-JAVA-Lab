
import java.lang.ArithmeticException;
public class A_Exception {

	public static void main(String[] args) {
		
		try {
			int a=100/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
	}

}
