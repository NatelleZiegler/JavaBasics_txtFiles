import java.util.*;
public class ValidationLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number between 10 and 24.");
		int input = 0;
		input = scan.nextInt();
		scan.nextLine();
		
		while (input < 10 || input > 24) {
			System.out.println("Please enter a number between 10 and 24.");
			input = scan.nextInt();
			scan.nextLine();
		}
		
		System.out.println("Your input was valid and you entered " + input + ".");
	}
}