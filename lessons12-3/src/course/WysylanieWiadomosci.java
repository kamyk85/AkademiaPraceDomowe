package course;

import java.util.Scanner;

public class WysylanieWiadomosci 
{

	public static void sendingMessage (String sender, String receiver, String message)
	{
		if (sender.isEmpty() || receiver.isEmpty() || message.isEmpty())
		{
		System.out.println("Data is incomplete");
		}
		else
		{
			System.out.println(sender + " to " + receiver + ": " + message);
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		System.out.println("Sender name:");
		String sender = read.nextLine();
		System.out.println("Receiver name:");
		String receiver = read.nextLine();
		System.out.println("Message:");
		String message = read.nextLine();
		
		sendingMessage(sender, receiver, message);

	}

}
