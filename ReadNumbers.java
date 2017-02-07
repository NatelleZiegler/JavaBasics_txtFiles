import java.io.*;
import java.util.*;
public class ReadNumbers {
	public static void main (String[] args) throws IOException {
		File myFile = new File("NumberList.txt");
		Scanner inputFile = new Scanner(myFile);
		for (int count = 1; count <= 100; count++) {
			int number = 0;
			number = inputFile.nextInt();
			System.out.println(number);
		}
		inputFile.close();
	}
}
		