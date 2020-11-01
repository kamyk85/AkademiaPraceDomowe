package course;

public class Cwiczenie1 
{

	public static void main(String[] args) 
	{
		int tab[] = {2, 6, 5, 9, 7, 1};
		
		for (int i=0; i<tab.length; i++)
		{
			if (tab[i] == 7 || tab[i] == 5)
			{
				tab[i] = 0;
			}
			else if (tab[i] == 6)
			{
				tab[i] = 8;
			}
			
			System.out.println(tab[i]);
		}

	}

}
