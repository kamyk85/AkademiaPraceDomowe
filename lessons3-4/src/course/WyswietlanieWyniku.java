package course;

	import java.util.Scanner;

public class WyswietlanieWyniku 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Aby pozna� wynik r�wnania (a+b)/(b/2) podaj kolejno warto�� a i b");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double c = (a+b)/(b/2);
		
		System.out.println ("Wynik r�wnania to " + c);
		

	}

}
