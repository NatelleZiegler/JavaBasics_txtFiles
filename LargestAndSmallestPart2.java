import java.util.*;
public class LargestAndSmallestPart2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Display general instructions
		System.out.println("Please enter a series of integers.");
		System.out.println("Enter -99 when finished.");
		System.out.println();
		
		//get the first number
		System.out.print("Enter an integer or -99 to end: ");
		int max = 0;
		int min = 0;
		int integers = 0;
		integers = scan.nextInt();
		scan.nextLine();
		max = integers;
		
		while (integers != -99) {
			System.out.print("Enter an integer or -99 to end: ");
			integers = scan.nextInt();
			scan.nextLine();
			if (integers > max) {
				max = integers;
			}
			else if (integers < min) {
				min = integers;
			}
			else {
			}
		} //end of user controlled while loop
		
		System.out.println("The highest number you entered was " + max + ".");
		System.out.println("The lowest number you entered was " + min + ".");
	}
}