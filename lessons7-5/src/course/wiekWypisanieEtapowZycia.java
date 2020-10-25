package course;

public class wiekWypisanieEtapowZycia 
{

	public static void main(String[] args) 
	{
		int wiek = 0;
		
		while (wiek <=100)
		{
			if (wiek <=1)
			{
				System.out.println (wiek + " = Infant");
				wiek++;
			}
			else if (wiek > 1 && wiek <= 13)
			{
				System.out.println (wiek + " = Child");
				wiek++;
			}
			else if (wiek > 13 && wiek <= 19)
			{
				System.out.println (wiek + " = Teenager");
				wiek++;
			}
			else if (wiek > 19 && wiek <= 65)
			{
				System.out.println (wiek + " = Adult");
				wiek++;
			}
			else
			{
				System.out.println (wiek + " = Elderly");
				wiek++;
			}
		}

	}

}
