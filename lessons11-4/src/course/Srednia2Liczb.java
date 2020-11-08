package course;

import java.util.Scanner;

public class Srednia2Liczb 
{

	public static void main(String[] args) 
	{
		Scanner read = null;
		int srednia = 0;
		int a=0;
		int b=0;
		
		
		try
		{
			read = new Scanner(System.in);
			System.out.println("Podaj liczby a i b typu int");
			a = read.nextInt();
			b = read.nextInt();
		}
		
		finally
		{
			if (read != null)
				read.close();
		}
		srednia = (a+b) / 2;
		
		System.out.println("Œrednia twoich liczb wynosi: " + srednia);

	}

}
