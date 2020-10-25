package course;

	import java.util.Scanner;

public class WyswietlanieWyniku 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Aby poznaæ wynik równania (a+b)/(b/2) podaj kolejno wartoœæ a i b");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double c = (a+b)/(b/2);
		
		System.out.println ("Wynik równania to " + c);
		

	}

}
