package course;

public class Cwiczenie2 
{

	public static void main(String[] args) 
	{
		int tab[] = {2, 5, 7, 2, 4, 7, 2, 8, 9, 5};
		int x = 2; //liczba do por�wnania
		int b = 0; //ilo�� takich samych
		
		for (int i=0; i<tab.length; i++)
		{
			if (x == tab[i])
			{
				b++;
			}
		}
		
		System.out.println ("Ilo�� wyst�powanie liczby " + x + " w tablicy, to " + b);
                

	}

}
