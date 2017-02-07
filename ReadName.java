import java.io.*;
import java.util.*;
public class ReadName {
	public static void main(String[] args) throws IOException {
		File myFile = new File ("MyName.txt");
		Scanner inputFile = new Scanner(myFile);
		String line = inputFile.nextLine();
		System.out.println(line);
		inputFile.close();
	}
}
