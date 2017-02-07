import java.util.*;
public class ValidationLoop3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		System.out.println("Please enter Yes or No.");
		input = scan.nextLine();
		while(!input.equalsIgnoreCase("Yes") && !input.equalsIgnoreCase("No")) {
			System.out.println("Please enter Yes or No.");
			input = scan.nextLine();
		}
		
		System.out.println("Your input is valid and you entered " + input + ".");
	}
}