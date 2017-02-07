import java.io.*;
public class NumbersToFile {
	public static void main (String[] args) throws IOException {
		PrintWriter outputFile = new PrintWriter("NumberList.txt");
		for (int count = 1; count <= 100; count ++) {
			outputFile.println(count);
		}
		outputFile.close();
	}
}