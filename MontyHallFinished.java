import java.util.Random;
import java.util.Scanner;
/**
*
* @author Ben Nguyen
* Monty Hall Project
*/

public class MontyHallFinished
{

	public static void main(String[] args) 
	{
		Random rand=  new Random();
		Scanner generator= new Scanner(System.in);

		int won=0;
System.out.println("How many times do you want to run the simulation: ");
		int times= generator.nextInt();
		while (times<10 || times>10000)
		{
System.out.println("Please enter a number between 10 and 10,000: ");
times= generator.nextInt();
		}

System.out.println("Do you want to switch or stay for every time? ");
		String choice= generator.next();
		while (!choice.equals("switch") && !choice.equals("stay"))
		{
System.out.println("That doesn't work. Please choose switch or stay: ");
			choice= generator.next();
		}

		for ( int i = 0; i < times; i++)
		{
			int car= rand.nextInt(3)+1;
			int guess= rand.nextInt(3)+1;
			int guess2= 1;

			if (guess>=1 && guess<=3)
			{
			if(guess==car)
				{
				if (car==1)
					{	
					int win= 2;
					guess2=3;
				}
				else if (car==2)
					{
					int win=3;
					guess2=1;
				}
				else if (car==3)
				{
					int win=1;
					guess2=2;
				}
			}
			else
			{
				if (car==1 && guess==2)
				{
					int win=3;
					guess2=1;
				}
			else if (car==2 && guess==3)
				{
					int win=1;
					guess2=2;
				}
			else if (car==3 && guess==1)
				{
					int win= 2;
					guess2= 3;
				}
			else if (car==1 && guess==3)
				{
					int win= 2;
					guess2=1;
				}
			else if (car==2 && guess==1)
				{
					int win=3;
					guess2=2;
				}
			else if (car==3 && guess==2)
				{
					int win=1;
					guess2=3;

				}
			}
	if (choice.equals("stay"))
			{
		if (guess== car)
		{
					won+=1;
				}
			}
	else if (choice.equals("switch"))
			{
		if (guess2==car)
				{
					won+=1;
				}
				}
		}
	}
	double percent= ((float)won/times)*100;
System.out.print("You won " + won + "/"+ times + " games (");
System.out.printf("%4.2f)", percent);
	}
}