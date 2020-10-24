

package course;

import java.util.Scanner;

public class Cwiczenie2PorownnieWynikow 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Podaj zmienn¹ a");
		double a = input.nextDouble();
		
		System.out.println ("Podaj zmienn¹ b");
		double b = input.nextDouble();
		
		double formA = (a + b) * (b / 2);
		double formB = b*(a/2);
		
		//System.out.println ("A=" + formA + " B=" + formB);
		
		if (formA > formB)
		{
			System.out.println ("Formula A");
		}
		
		else if (formA < formB)
		{
			System.out.println ("Formula B");
		}
		
		else if (formA == formB)
		{
			System.out.println ("Equal");
		}

	}

}
