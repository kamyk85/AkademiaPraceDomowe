package course;

import java.util.Scanner;

public class PoleTrojkata 
{

	public static void triangleArea (double a, double h)
	{
		double area = a/2 * h;
		System.out.println(area);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		System.out.println ("Podaj dlugosc podstawy a nastêpnie wysokoœæ w cm");
		double a = read.nextDouble();
		double h = read.nextDouble();
		triangleArea(a,h);

	}

}
