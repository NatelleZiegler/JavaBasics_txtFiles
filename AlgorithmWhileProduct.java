import java.util.*;
public class AlgorithmWhileProduct {
	public static void main(String[] args) {
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.");
		input = scan.nextInt();
		scan.nextLine();
		int product = 0;
		final int CONSTANT = 10;
		product = input * CONSTANT;
		
		while (product < 10) {
			System.out.println("Please enter a number.");
			input = scan.nextInt();
			scan.nextLine();
			product = input * CONSTANT;
		}
	}
}