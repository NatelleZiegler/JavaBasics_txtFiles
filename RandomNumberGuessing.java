import java.util.*;
public class RandomNumberGuessing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int randNum;
		randNum = rand.nextInt(20) + 1;
		
		System.out.println("The computer has generated a random number between one and twenty.");
		System.out.print("Guess the number: ");
		int userGuess;
		userGuess = scan.nextInt();
		while (userGuess > 20 || userGuess < 1) {
			System.out.println("Please enter a number between one and twenty.");
			userGuess = scan.nextInt();
			scan.nextLine();
		}
		
		while (userGuess != randNum) {
			System.out.print("Incorrect. ");
			if (userGuess < randNum) {
				System.out.println("Too low, try again.");
			}
			else {
				System.out.println("Too high, try again.");
			}
			userGuess = scan.nextInt();
			scan.nextLine();
			
			while (userGuess > 20 || userGuess < 1) {
				System.out.println("Please enter a number between one and twenty.");
				userGuess = scan.nextInt();
				scan.nextLine();
			}
		}
		
		System.out.println("You have guessed correctly! The number was " + randNum + ".");
	}
}