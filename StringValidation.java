import java.util.*;
public class StringValidation {
	public static void main (String[] args) {
		String input = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter yes or no.");
		input = scan.nextLine();
		
		while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")) {
			System.out.println("Please enter yes or no.");
			input = scan.nextLine();
		}
		System.out.println("Your input is valid and you entered " + input);
	}
}