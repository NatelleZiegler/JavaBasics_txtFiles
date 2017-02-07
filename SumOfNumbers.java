import java.util.*;
public class SumOfNumbers {
	public static void main (String[] args) {
		
		//acquiring user input
		Scanner scan = new Scanner(System.in);
		int value = 0;
		System.out.println("Please enter a positive non-zero integer.");
		value = scan.nextInt();
		scan.nextLine();
		while (value < 0 || value == 0) {
			System.out.println("Please enter a positive non-zero integer.");
			value = scan.nextInt();
			scan.nextLine();
		}
		
		//calculating total
		int total = 0;
		for (int count = 1; count <= value; count++) {
			total += count;
		}
		System.out.println("Your total is " + total + ".");
	}
}