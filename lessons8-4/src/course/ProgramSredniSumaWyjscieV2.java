package course;

	import java.util.Scanner;

public class ProgramSredniSumaWyjscieV2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println ("Podaj kolejno wartoœæ a, b, c");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		boolean start = true;
		int i = 0;
		
		while (start)
		{
			System.out.println ("1. Policz œredni¹");
			System.out.println ("2. Policz sumê");
			System.out.println ("3. Wyjœcie z programu");
			
			i=input.nextInt();
			
			if (i == 1)
			{
				double srednia = (a+b+c)/3;
				System.out.println ("œrednia liczb = " + srednia);
			}
			
			else if (i == 2)
			{
				double suma = a + b + c;
				System.out.println ("suma liczb = " + suma);
			}
			
			else if (i == 3)
			{
				start = false;
			}
			else
			{
				System.out.println ("Poda³eœ b³êdn¹ wartoœæ wprowadz ponownie");
			}

		}
	}
}
