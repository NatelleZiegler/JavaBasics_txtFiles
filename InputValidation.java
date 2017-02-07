import java.util.*;
public class InputValidation {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.println("Please enter a number from 1 to 4.");
		number = scan.nextInt();
		scan.nextLine();
		while (number < 1 || number > 4) {
			System.out.println("Please enter a valid number 1 through 4.");
			number = scan.nextInt();
			scan.nextLine();
		}
		System.out.println("Your number is valid and you entered " + number);
	}
}