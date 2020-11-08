package course;

public class ZliczanieWystapienLitery 
{

	public static void main(String[] args) 
	{
		String slowo = "Abracadabra";
		
		int ile = 0;
		
		for (int i =0; i < slowo.length(); i++)
		{
			if (slowo.charAt(i) == 'a' || slowo.charAt(i) == 'A')
			{
				ile++;
			}
		}
		
		System.out.println(ile);

	}

}
