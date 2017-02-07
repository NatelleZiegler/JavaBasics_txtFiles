import java.util.*;
public class SquareDisplay {
	public static void main(String[] args) {
		System.out.println("Please enter a number between one and fifteen.");
		Scanner scan = new Scanner(System.in);
		int number;
		number = scan.nextInt();
		scan.nextLine();
		while (number < 1 || number > 15) {
			System.out.println("Please enter a number between one and fifteen.");
			number = scan.nextInt();
			scan.nextLine();
		}
		for (int row = 0; row < number; row++) {
			for (int col = 0; col < number; col++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
}