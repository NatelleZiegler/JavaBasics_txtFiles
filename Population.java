import java.util.*;
public class Population {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double popZero = 0; //population at time zero
		System.out.println("How many organisms did you start out with?");
		popZero = scan.nextDouble();
		scan.nextLine();
		
		while (popZero < 2) {
			System.out.println("Your beginning population size must be at least two.");
			System.out.println("How many organisms did you start with?");
			popZero = scan.nextDouble();
			scan.nextLine();
		}
		
		double popIncrease = 0;
		System.out.println("What is the average percent rate of growth of your population each day?");
		System.out.println("Please enter your number as a decimal.");
		popIncrease = scan.nextDouble();
		scan.nextLine();
		
		while (popIncrease < 0) {
			System.out.println("Your growth rate must be a positive number.");
			System.out.println("What is the average percent rate of growth of your population each day?");
			popIncrease = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("For how many days will your sample be multiplying?");
		double days = 0;
		days = scan.nextDouble();
		scan.nextLine();
		
		while (days < 1) {
			System.out.println("Please enter a valid number of days.");
			days = scan.nextDouble();
			scan.nextLine();
		}
		
		System.out.println("Day 1: " + popZero);
		double daysPop = popZero;
		for (int count = 1; count <= (days-1); count++) {
			System.out.print("Day " + (count + 1) + ": ");
			daysPop = (daysPop * popIncrease) + daysPop;
			System.out.println(daysPop);
		}
	}
}