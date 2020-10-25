package course;

import java.util.Scanner;

public class Cwiczenie2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Podaj wartoœæ a");
		
		int a = input.nextInt();
		
		if (a > 5 && a <=15 && a != 10)
		{
			System.out.println ("YES");
		}
		
		else
		{
			System.out.println ("NO");
		}

	}

}
