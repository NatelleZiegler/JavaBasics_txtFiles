import java.util.*;
public class ValidationLoop2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		System.out.println("Please enter a Y or N");
		input = scan.nextLine();
		while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
			System.out.println("Please enter Y or N");
			input = scan.nextLine();
		}
		
		System.out.println("Your input was valid and you entered " + input + ".");	
	}
}