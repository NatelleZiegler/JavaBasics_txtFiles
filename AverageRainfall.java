import java.util.*;
public class AverageRainfall {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numYears = 0;
		System.out.println("For how many years have you been collecting data?");
		numYears = scan.nextInt();
		scan.nextLine();
		
		while (numYears < 1) {
			System.out.println("Program can only calculate average rainfall for a period of one or more years.");
			System.out.println("Please enter a valid number of years.");
			numYears = scan.nextInt();
			scan.nextLine();
		}
		
		int totalRainfall = 0;
		for (int years = 1; years <= numYears; years++) {
			for (int months = 1; months <= 12; months++) {
				System.out.println("How much rain fell, in inches, in month " + months + " of year " + years + "?");
				int rainfall = 0;
				rainfall = scan.nextInt();
				scan.nextLine();
				
				while (rainfall < 0) {
					System.out.println("Please enter a valid number of inches for the monthly rainfall.");
					rainfall = scan.nextInt();
					scan.nextLine();
				}
				
				totalRainfall += rainfall;
			}
		} //close both for loops
		
		int totalMonths = numYears * 12;
		System.out.println("You collected data for a total of " + totalMonths + " months.");
		System.out.println("Over the course of these " + totalMonths + " months, there was a total of " + totalRainfall + " inches of rain");
		int averageRain = 0;
		averageRain = totalRainfall / totalMonths;
		System.out.println("There was an average of " + averageRain + " inches of rainfall each month.");
	}
}