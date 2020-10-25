package course;

	import java.util.Scanner;

public class Powitanie 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Jak masz na imiê?");
		String imieRozmowcy = input.nextLine();
		
		String imieProgramu = "kamyk";
		
		System.out.print("Hi ");
		System.out.print(imieRozmowcy);
		System.out.print(" i'm ");
		System.out.print(imieProgramu);

	}

}
