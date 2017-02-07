import java.util.*;
public class LetterCounter {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = " ";
		String userString = " ";
		char userChar = 'a';
		
		System.out.println("Please enter a string.");
		userString = scan.nextLine();
		userString = userString.toLowerCase();
		System.out.println("Please enter a single letter.");
		input = scan.nextLine();
		input = input.toLowerCase();
		userChar = input.charAt(0);
		
		int stringSize = 0; //used for holding the size of the string
		stringSize = userString.length();
		int total = 0;
		
		for (int count = 0; count < stringSize; count++) {
			char stringLetter = 'a';
			stringLetter = userString.charAt(count);
			if (stringLetter == userChar) {
				total += 1;
			}
		}
		
		System.out.println("The letter " + userChar + " appears in your inputed string a total of " + total + " times.");
	}
}