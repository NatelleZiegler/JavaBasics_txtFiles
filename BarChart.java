import java.util.*;
import java.io.*;
public class BarChart {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("BarChart.txt");
		int sales = 0;
		System.out.println("You will be asked to enter the sales totals for your five stores.");
		System.out.println("Please enter the sales totals rounded to the nearest whole number, i.e. no decimals.");
		System.out.println();
		
		for (int count = 1; count <= 5; count++) {
			System.out.print("Enter today's sales for the store " + count + ": ");
			sales = scan.nextInt();
			scan.nextLine();
			while (sales < 0) {
				System.out.println("Please enter positive numbers only.");
				sales = scan.nextInt();
				scan.nextLine();
			}
			outputFile.println(sales);
		}
		outputFile.close();
		
		File myFile = new File ("BarChart.txt");
		Scanner inputFile = new Scanner(myFile);
		
		for (int store = 1; store <= 5; store ++) {
			System.out.println();
			int number = 0;
			number = inputFile.nextInt();
			inputFile.nextLine();
			number = number / 100;
			System.out.print("Store " + store + ": ");
			for (int x = 0; x < number; x++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
		
	}
}
