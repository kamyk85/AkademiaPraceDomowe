package course;

public class Cwiczenie1Swiatla 
{

	public static void main(String[] args) 
	{
		int time = 6;
		
		if (time>0 && time<=10)
		{
			System.out.println ("Green");
		}
		
		else if (time>10 && time<=15)
		{
			System.out.println ("Yellow");
		}
		else if (time>15)
		{
			System.out.println ("Red");
		}
		else if (time<0)
		{
			System.out.println ("Error");
		}
		else if (time==0)
		{
			System.out.println ("????");
		}

	}

}
