import java.io.*;
import java.util.*;
public class ReadNumbersRedux {
	public static void main (String[] args) throws IOException {
		File myFile = new File("NumberList.txt");
		Scanner inputFile = new Scanner(myFile);
		int total = 0;
		for (int count = 1; count <= 100; count++) {
			int number = 0;
			number = inputFile.nextInt();
			System.out.println(number);
			total += number;
		}
		inputFile.close();
		System.out.println("Your total is " + total + ".");
	}
}
		