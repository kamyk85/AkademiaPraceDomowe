package course;

import java.util.Scanner;

public class kalkulator 
{

	public static void main(String[] args) 
	{
		Scanner read = null;
		double a = 0;
		double b = 0;
		
		double suma = 0;
		double roznica = 0;
		double iloraz = 0;
		double iloczyn = 0;
		int i = 0;
		
		try
		{
			read = new Scanner(System.in);
			System.out.println ("Podaj liczbê 'a' oraz liczbê 'b'");
			a = read.nextDouble();
			b = read.nextDouble();
			boolean start = true;
			
			while (start)
				{
				System.out.println("KALKULATOR Wybierz co mam zrobiæ");
				System.out.println("1. Dodawanie (a + b)");
				System.out.println("2. Odejmowanie (a - b)");
				System.out.println("3. Mno¿enie (a x b)");
				System.out.println("4. Dzielenie (a : b)");
				System.out.println("5. Podaj nowe liczby");
				System.out.println("6. WYJŒCIE");
				
				i = read.nextInt();
				
				if (i == 1)
				{
					suma = a+b;
					System.out.println("Suma liczb " + a + " i " + b + " wynosi: " + suma);
				}
				else if (i == 2)
				{
					roznica = a-b;
					System.out.println("Ró¿nica liczb " + a + " i  " + b + " wynosi: " + roznica);
				}
				else if (i == 3)
				{
					iloczyn = a*b;
					System.out.println("Iloczyn liczb " + a + " i  " + b + " wynosi: " + iloczyn);
				}
				else if (i == 4)
				{
					iloraz = a/b;
					System.out.println("Iloraz liczb " + a + " i  " + b + " wynosi: " + iloraz);
				}
				else if (i == 5)
				{
					System.out.println("Podaj nowe a oraz b");
					a = read.nextDouble();
					b = read.nextDouble();
				}
				else if (i == 6)
				{
					start = false;
				}
				
				}
		}
		finally 
		{
			if (read != null)
				read.close();
		}

	}

}
