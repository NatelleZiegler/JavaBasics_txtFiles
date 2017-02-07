import java.util.*;
public class AlgorithmDoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numA = 0; //for storing first number
		int numB = 0; //for storing second number
		int sum = 0; //for storing sum of numbers A and B
		String input = ""; //for storing user input
		char confirm = 'a'; //for validating confirmation
		
		do {
			System.out.println("Please enter a number.");
			numA = scan.nextInt();
			scan.nextLine();
			
			System.out.println("Please enter another number.");
			numB = scan.nextInt();
			scan.nextLine();
			sum = numA + numB;
			System.out.println("The sum of your two numbers is " + sum + ".");
			
			//now we will confirm that the user wants to stay in the loop
			
			System.out.println("Do you want to do that again?");
			System.out.println("Enter Y for yes or N for no.");
			input = scan.nextLine();
			confirm = input.charAt(0);
		} while (confirm == 'Y' || confirm == 'y');
	}
}