package course;

public class Cwiczenie2 
{

	public static void main(String[] args) 
	{
		int tab[] = {2, 5, 7, 2, 4, 7, 2, 8, 9, 5};
		int x = 2; //liczba do porównania
		int b = 0; //iloœæ takich samych
		
		for (int i=0; i<tab.length; i++)
		{
			if (x == tab[i])
			{
				b++;
			}
		}
		
		System.out.println ("Iloœæ wystêpowanie liczby " + x + " w tablicy, to " + b);
                

	}

}
