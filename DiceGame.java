import java.util.*;
public class DiceGame {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int userDie;
		int compDie;
		int userWins = 0;
		int compWins = 0;
		
		for (int count = 1; count <= 10; count++) {
			compDie = rand.nextInt(6) + 1;
			System.out.println("The computer rolled a " + compDie + ".");
			userDie = rand.nextInt(6) + 1;
			System.out.println("The user rolled a " + userDie + ".");
			if (compDie > userDie) {
				System.out.println("The computer is the winner of round " + count + ".");
				compWins += 1;
			}
			else if (compDie < userDie) {
				System.out.println("You are the winner of round " + count + ".");
				userWins += 1;
			}
			else {
				System.out.println("You and the computer are tied. There is no winner for round " + count + ".");
			}
		}
			
			if (compWins > userWins) {
				System.out.println("The computer is the grand winner with a total of " + compWins + " wins.");
			}
			else if (compWins < userWins) {
				System.out.println("The user is the grand winner with a total of " + userWins + " wins.");
			}
			else {
				System.out.println("You ended in a tie with the computer.");
			}
	}
}