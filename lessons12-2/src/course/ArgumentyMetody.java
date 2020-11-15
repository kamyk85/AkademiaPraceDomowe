package course;

public class ArgumentyMetody 
{

	public static void checkArea(int a, int b)
	{
		int area = a * b;
		
		if (area >= 1000)
		{
			System.out.println("Area: " + area);
		}
		else
		{
			System.out.println("Too small");
		}
	}
	
	
	public static void main(String[] args) 
	{
		checkArea(19,9);
		checkArea(20,100);
		checkArea(50,25);
		checkArea(30,40);
		checkArea(8,16);

	}

}
