import java.io.*;
public class OpenExistingFile {
	public static void main (String [] args) throws IOException {
		FileWriter fwriter = new FileWriter("NumberList.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		outputFile.println("Blue");
		outputFile.close();
		}
	}