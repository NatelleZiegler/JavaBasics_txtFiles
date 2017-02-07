import java.util.*;
import java.io.*;
public class DistanceFile {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		double speed;
		double hours;
		double distance;
		
		System.out.println("How fast, in MPH, was your vehicle traveling?");
		speed = scan.nextDouble();
		scan.nextLine();
		
		while (speed <= 0 || speed > 250) {
			System.out.println("Please enter a valid speed in MPH.");
			speed = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("For how many hours did you travel?");
		hours = scan.nextDouble();
		scan.nextLine();
		
		while (hours < 1) {
			System.out.println("Please enter a valid number of hours traveled.");
			hours = scan.nextDouble();
			scan.nextLine();
		}
		
		PrintWriter outputFile = new PrintWriter("Distance.txt");
		
		outputFile.println("Hour\tDistance Traveled");
		outputFile.println("--------------------------");
		
		for (int count = 1; count <= hours; count++) {
			distance = speed * count;
			outputFile.println(count + "\t" + distance);
		}
		
		outputFile.close();
	}
}