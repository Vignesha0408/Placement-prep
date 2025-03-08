//Task 1 by internpe.
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
	
	int randno(int n)
	{
		int randno;
		Random rn = new Random();
		randno= rn.nextInt(n+1);
		return randno;
	}

	public static void main(String[] args) {
		System.out.println("--------------------------------------------------------------------");
		System.out.println("The number guessing game..");
		
		System.out.print("Enter name:");
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		System.out.println("Good Morning!!.. "+s1);
		System.out.println("--------------------------------------------------------------------");

		int yourguess,computerguess,c=0;
		
		System.out.print("Enter the range (eg.100) =");
		 
		Scanner scn1 =new Scanner(System.in);
		int range;
		range = scn1.nextInt();
		System.out.print("Guess number between 0 to "+range+":");
		
		 
		yourguess=scn1.nextInt();c=c+1;
		System.out.println("");
		
		//creating object
		GuessingGame ob1= new GuessingGame();
		computerguess = ob1.randno(range);
		while(true)
		{
		if (yourguess == computerguess)
			{
			System.out.println("Correct guess..\n*****\nYou won the match\n*****");
			break;
			}
		else
		{
			if(yourguess < computerguess)
				System.out.println("\nguess..is too low.");
			else
				System.out.println("\nguess..is too high.");
		}
		
		System.out.println("-1 to exit.");
		System.out.print("\nTry again..\nEnter choice:");
		yourguess=scn1.nextInt();c=c+1;
		if(yourguess == -1)
			break;
		}
		System.out.println("\n\nThe number was "+computerguess+"\nTotal attempts:"+c);
		
	 scn1.close();
	  
	}

}

/*
 --------------------------------------------------------------------
The number guessing game..
Enter name:Raj
Good Morning!!.. Raj
--------------------------------------------------------------------
Enter the range (eg.100) =50
Guess number between 0 to 50:25


guess..is too high.
-1 to exit.

Try again..
Enter choice:20

guess..is too high.
-1 to exit.

Try again..
Enter choice:10

guess..is too high.
-1 to exit.

Try again..
Enter choice:5

guess..is too high.
-1 to exit.

Try again..
Enter choice:2
Correct guess..
*****
You won the match
*****


The number was 2
Total attempts:5
*/

 
		