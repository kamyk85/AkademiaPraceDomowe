package course;

public class MetodyBoolean 
{

	public static boolean check()
	{
		int a = 5;
		
		return a > 6;
	}
	
	
	public static void main(String[] args) 
	{
		if (check())
		{
			System.out.println ("Greater");
		}
		else
		{
			System.out.println ("Smaller");
		}

	}

}
