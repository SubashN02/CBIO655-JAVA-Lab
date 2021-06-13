package GeneticCode;

public class GeneticCodePrint {

	String str;
	public String PrintCodon(String str)
	{
		String str1="";
		if(str.equalsIgnoreCase("F"))
		{
			str1="UUU/UUC";
		}
		else if(str.equalsIgnoreCase("L"))
		{
			str1="UUA/UUG/CUU/CUC/CUA/CUG";
		}
		else if(str.equalsIgnoreCase("I"))
		{
			str1="AUU/AUC/AUA";
		}
		else if(str.equalsIgnoreCase("M"))
		{
			str1="AUG";
		}
		else if(str.equalsIgnoreCase("V"))
		{
			str1="GUU/GUC/GUA/GUG";
		}
		else if(str.equalsIgnoreCase("S"))
		{
			str1="UCU/UCC/UCA/UCG";
		}
		else if(str.equalsIgnoreCase("P"))
		{
			str1="CCU/CCA/CCG/CCC";
		}
		else if(str.equalsIgnoreCase("T"))
		{
			str1="ACU/ACC/ACG/ACA";
		}
		else if(str.equalsIgnoreCase("A"))
		{
			str1="GCU/GCC/GCA/GCG";
		}
		else if(str.equalsIgnoreCase("Y"))
		{
			str1="UAU/UAC";
		}
		else if(str.equalsIgnoreCase("H"))
		{
			str1="CAU/CAC";
		}
		else if(str.equalsIgnoreCase("Q"))
		{
			str1="CAA/CAG";
		}
		else if(str.equalsIgnoreCase("N"))
		{
			str1="AAU/AAC";
		}
		else if(str.equalsIgnoreCase("K"))
		{
			str1="AAA/AAG";
		}
		else if(str.equalsIgnoreCase("D"))
		{
			str1="GAU/GAC";
		}
		else if(str.equalsIgnoreCase("E"))
		{
			str1="GAA/GAG";
		}
		else if(str.equalsIgnoreCase("C"))
		{
			str1="UGU/UGC";
		}
		else if(str.equalsIgnoreCase("W"))
		{
			str1="UGG";
		}
		else if(str.equalsIgnoreCase("R"))
		{
			str1="CGU/CGC/CGA/CGG";
		}
		else if(str.equalsIgnoreCase("S"))
		{
			str1="AGU/AGC";
		}
		else if(str.equalsIgnoreCase("R"))
		{
			str1="AGA/AGG";
		}
		else if(str.equalsIgnoreCase("G"))
		{
			str1="GGU/GGA/GGC/GGG";
		}
		return str1;
	}
}

import java.util.Scanner;

import GeneticCode.GeneticCodePrint;
public class AminoacidToCodon {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an amino acid :");
		String str=s.nextLine();
		GeneticCodePrint g=new GeneticCodePrint();
		System.out.println("Codon : "+g.PrintCodon(str));
	}

}
