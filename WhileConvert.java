import java.util.*;
public class WhileConvert {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input = "";
		char sure = 'z';
		while (sure != 'Y' && sure != 'N') {
			System.out.println("Are you sure you want to quit?");
			input = keyboard.nextLine();
			sure = input.charAt(0);
		}
	}
}