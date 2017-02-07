import java.util.*;
import java.io.*;
public class FileLetterCounter {
	public static void main (String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String input = " ";
		System.out.println("Please enter the name of the file.");
		input = scan.nextLine();
		String fileName = " ";
		fileName = input;
		
		char userChar = 'a';
		System.out.println("Please enter a single letter.");
		input = scan.nextLine();
		input = input.toLowerCase();
		userChar = input.charAt(0);
		
		File myFile = new File(fileName);
		Scanner inputFile = new Scanner(myFile);
		
		int total = 0;
		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();
			line = line.toLowerCase();
			int stringSize = 0;
			stringSize = line.length();
			
			for (int count = 0; count < stringSize; count++) {
				char stringLetter = 'a';
				stringLetter = line.charAt(count);
				if (stringLetter == userChar) {
					total += 1;
				}
			}
		}
		
		inputFile.close();
		System.out.println("The letter " + userChar + " appears in your file a total of " + total + " times.");
	}
}