import java.util.*;
public class BudgetAnalysis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How much money have you budgeted for this month?");
		System.out.print("$ ");
		double budget;
		double expenses;
		budget = scan.nextDouble();
		scan.nextLine();
		
		char repeat;
		String input;
		double total = 0;
		
		do {
			System.out.println("Please enter all of your individual expenses for this month.");
			System.out.print("$ ");
			expenses = scan.nextDouble();
			scan.nextLine();
			total += expenses;
			
			System.out.println("Do you have any other expenses to add?");
			System.out.print("Enter Y for yes and N for no: ");
			input = scan.nextLine();
			repeat = input.charAt(0);
		} while (repeat == 'Y' || repeat == 'y');
		
		double overUnder = budget - total;
		if (overUnder < 0) {
			overUnder *= -1;
			System.out.printf("You are over budget this month by %.2f dollars.", overUnder);
			System.out.println();
		}
		else if (overUnder > 0) {
			System.out.printf("You are under budget by %.2f dollars.", overUnder);
			System.out.println();
		}
		else {
			System.out.println("You are exactly on budget.");
			System.out.println();
		}
	}
}