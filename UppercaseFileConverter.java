import java.util.*;
import java.io.*;
public class UppercaseFileConverter {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name of the file you are reading from.");
		String input;
		input = scan.nextLine();
		
		File myFile = new File(input);
		Scanner inputFile = new Scanner(myFile);
		System.out.println("Give a name to your new file.");
		input = scan.nextLine();
		PrintWriter outputFile = new PrintWriter(input);
		
		while (inputFile.hasNext()) {
			String line;
			line = inputFile.nextLine();
			line = line.toUpperCase();
			outputFile.println(line);
		}
		
		inputFile.close();
		outputFile.close();
	}
}
		