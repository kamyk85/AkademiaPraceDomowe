package course;

import java.util.Scanner;

public class PoleTrapezu 
{

	public static void trapezoidArea(double a, double b, double h)
	{
		double area = ((a+b)*h)/2;
		System.out.println(area);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		System.out.println("Podaj wartoœæ podstawy a, b a nastêpnie wysokoœæ h w cm");
		double a = read.nextDouble();
		double b = read.nextDouble();
		double h = read.nextDouble();
		trapezoidArea(a,b,h);

	}

}
