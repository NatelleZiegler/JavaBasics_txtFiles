import java.util.*;
public class PennyPay {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		double daysPay = 0;
		double total = 0;
		
		System.out.println("How many days did you work?");
		double days = 0;
		days = scan.nextDouble();
		scan.nextLine();
		
		while (days < 1) {
			System.out.println("Please enter a valid number of days worked.");
			days = scan.nextDouble();
			scan.nextLine();
		}
		
		daysPay = 0.01;
		total += daysPay;
		System.out.printf("Day 1\t\t$%.2f", daysPay);
		System.out.println();
		
		for (int count = 1; count <= (days - 1); count++) {
			daysPay *= 2;
			System.out.print("Day " + (count + 1) + "\t\t");
			System.out.printf("$%,.2f", daysPay);
			System.out.println();
			total += daysPay;
		}
		
		System.out.println("-----------------------------");
		System.out.printf("Total earned\t$%,.2f", total);
		System.out.println();
		
	}
}
		
		