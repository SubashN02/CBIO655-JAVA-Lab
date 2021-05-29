import java.util.Arrays;
public class Aminoacid {
	public static void main(String[] args) {
		String amino[]= {"G","A","S","T","C","V","L","I","M","P","F","Y","W","D","E","N","Q","H","K","R"};
		Arrays.sort(amino);
		System.out.println("Amino acids in sorted order: "+Arrays.toString(amino));
	}
}
