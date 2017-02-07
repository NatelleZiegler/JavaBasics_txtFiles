import java.util.*;
import java.io.*;
public class LargestAndSmallest {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("LargestAndSmallest.txt");
		
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
			outputFile.println(integers);
		}
		
		outputFile.close();
		
		File myFile = new File("LargestAndSmallest.txt");
		Scanner inputFile = new Scanner(myFile);
		
		while (inputFile.hasNext()) {
			int number = 0;
			number = inputFile.nextInt();
			if (number > max) {
				max = number;
			}
			else if (number < min) {
				min = number;
			}
			else {
				number = 0;
			}
		}
		
		inputFile.close();
		
		System.out.println("The largest number you enteres was " + max + ".");
		System.out.println("The smallest number you entered was " + min + ".");
	}
}