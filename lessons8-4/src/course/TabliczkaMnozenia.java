package course;

public class TabliczkaMnozenia 
{

	public static void main(String[] args) 
	{
		int a=0;
		int b=0;
		
		for (a=1; a <= 10; a++)
		{
			for (b=1; b <= 10; b++)
			{
				int iloczyn = a*b;
				System.out.println (iloczyn);
			}
		}

	}

}
