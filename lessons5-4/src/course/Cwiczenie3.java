package course;

import java.util.Scanner;

public class Cwiczenie3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Podaj wartoœæ a");
		double a = input.nextDouble ();
		
		boolean b = true;
		
		if (a < 45 || b)
		{
			System.out.println ("YES");
		}
		
		else
		{
			System.out.println ("NO");
		}

	}

}
