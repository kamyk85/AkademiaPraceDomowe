package course;

	import java.util.Scanner;

public class Cwiczenie1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Podaj wartoœæ a");
		
		int a = input.nextInt();
		
		if (a > 5 && a <=15)
		{
			System.out.println ("YES");
		}
		
		else
		{
			System.out.println ("NO");
		}

	}

}
