import java.io.*;
import java.util.*;
public class Name {
	public static void main(String[] args) throws IOException {
		PrintWriter outputFile = new PrintWriter("MyName.txt");
		outputFile.println("Natelle");
		outputFile.close();
	}
}