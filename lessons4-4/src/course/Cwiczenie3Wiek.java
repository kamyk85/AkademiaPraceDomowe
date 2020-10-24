package course;

import java.util.Scanner;

public class Cwiczenie3Wiek 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Podaj swój wiek");
		int wiek = input.nextInt();
		
		if (wiek>=0 && wiek<=1)
		{
			System.out.println ("Infant");
		}
		else if (wiek>1 && wiek<=13)
		{
			System.out.println ("Child");
		}
		else if (wiek>13 && wiek<=19)
		{
			System.out.println ("Teenager");
		}
		else if (wiek>19 && wiek<=65)
		{
			System.out.println ("Adult");
		}
		else if (wiek>65 && wiek<100)
		{
			System.out.println ("Elderly");
		}
		else if (wiek>=100)
		{
			System.out.println ("Elderly");
			System.out.println ("CONGRATULATIONS!");
		}
		else if (wiek<0)
		{
			System.out.println ("Error");
		}
//		if (wiek>=100)
//		{
//			System.out.println ("CONGRATULATIONS!")
//		}
//		Mo¿na to by³o wstawiæ zamiast rozdzielaæ na dwa else if wiek 65-99 i >=100
	}

}
