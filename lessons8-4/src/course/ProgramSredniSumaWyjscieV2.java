package course;

	import java.util.Scanner;

public class ProgramSredniSumaWyjscieV2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println ("Podaj kolejno warto�� a, b, c");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		boolean start = true;
		int i = 0;
		
		while (start)
		{
			System.out.println ("1. Policz �redni�");
			System.out.println ("2. Policz sum�");
			System.out.println ("3. Wyj�cie z programu");
			
			i=input.nextInt();
			
			if (i == 1)
			{
				double srednia = (a+b+c)/3;
				System.out.println ("�rednia liczb = " + srednia);
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
				System.out.println ("Poda�e� b��dn� warto�� wprowadz ponownie");
			}

		}
	}
}
