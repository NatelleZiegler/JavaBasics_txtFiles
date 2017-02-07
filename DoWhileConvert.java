import java.util.*;
public class DoWhileConvert {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x = 1;
	
		do {
			System.out.print("Enter a number: ");
			x = keyboard.nextInt();
		} while (x > 0);
	}
}