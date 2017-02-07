import java.io.*;
import java.util.*;
public class LineNumbers {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String filename;
		System.out.println("What is the name of the file you are using?");
		filename = scan.nextLine();
		
		File myFile = new File(filename);
		Scanner inputFile = new Scanner(myFile);
		int lineNum = 1;
		while (inputFile.hasNext()) {
			String line;
			line = inputFile.nextLine();
			System.out.print(lineNum + ": ");
			System.out.println(line);
			lineNum += 1;
			}
			inputFile.close();
		}
	}