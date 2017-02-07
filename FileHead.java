import java.util.*;
import java.io.*;
public class FileHead {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name of a file.");
		String filename;
		filename = scan.nextLine();
		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);
		System.out.println();
		
		for (int count = 1; count <= 5; count++) {
			String line;
			if (!(inputFile.hasNext())) {
				System.exit(0);
			}
			line = inputFile.nextLine();
			System.out.println(line);
		}
		inputFile.close();
	}
}