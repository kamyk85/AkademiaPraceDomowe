package course;

public class ProgramSredniaSumaWyjscie 
{

	public static void main(String[] args) 
	{
		double a = 7;
		double b = 3;
		double c = 6;
		boolean start = true;
		int i = 0;
		
		while (start)
		{
			System.out.println ("1. Policz �redni�");
			System.out.println ("2. Policz sum�");
			System.out.println ("3. Wyj�cie z programu");
			
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
			i++;
		}

	}

}
