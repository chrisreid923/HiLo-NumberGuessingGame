import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String playAgain = "";

		do {
			//Create a random number for the user to guess. 
			int theNumber = (int)(Math.random() * 100 + 1);

			int guess = 0;
			int numberOfTries = 0;

			while(guess != theNumber) {
				
				System.out.println("Guess a number between 1 and 100:");
				guess = scan.nextInt();

				if(guess < theNumber) {
					System.out.println(guess + " is too low. Try Again");

				}else if (guess > theNumber) {
					System.out.println(guess + " is too high. Try Again");

				}else {
					System.out.println(guess + " is correct. You win!");
				}
				
				numberOfTries = numberOfTries + 1;
				if (numberOfTries == 1)
					System.out.println("You have made: " + numberOfTries +  " guess so far");
				else System.out.println("You have made: " + numberOfTries + " guesses so far");
			}
			System.out.println("Would you like to play again (y/n)");
			playAgain = scan.next();

		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank You for Playing! Goodbye!");

		scan.close();
	}

}
