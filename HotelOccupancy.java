import java.util.*;
public class HotelOccupancy {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int numFloors = 0;
		System.out.println("How many floors did are there in your hotel?");
		while (numFloors < 1) {
			System.out.println("Please enter a valid number of floors.");
			numFloors = scan.nextInt();
			scan.nextLine();
		}
		
		double totalRooms = 0;
		double totalOccupied = 0;
		double totalVacant = 0;
		
		for (int count = 1; count <= numFloors; count++) {
			System.out.println("How many rooms are located on floor number " + count + "?");
			int numRooms = 0;
			numRooms = scan.nextInt();
			scan.nextLine();
			
			while (numRooms < 10) {
				System.out.println("Your hotel must contain at least ten rooms on each floor.");
				System.out.println("Please enter a valid number of rooms for floor number " + count + ".");
				numRooms = scan.nextInt();
				scan.nextLine();
			}
			
			totalRooms += numRooms;
			System.out.println("How many of these rooms are occupied?");
			int numOccupied = 0;
			int numVacant = 0;
			
			numOccupied = scan.nextInt();
			scan.nextLine();
			
			while (numOccupied > numRooms || numOccupied < 0) {
				System.out.println("Please enter a valid number of occupied rooms for floor number " + count + ".");
				numOccupied = scan.nextInt();
				scan.nextLine();
			}
			
			totalOccupied += numOccupied;
			numVacant = numRooms - numOccupied;
			totalVacant += numVacant;
		} //end of for loop
		
		System.out.print("Total number of rooms\t\t\t\t");
		System.out.printf("%.0f\n", totalRooms);
		System.out.print("Total number of occupied rooms\t\t\t");
		System.out.printf("%.0f\n", totalOccupied);
		System.out.print("Total number of vacancies\t\t\t");
		System.out.printf("%.0f\n", totalVacant);
		
		double occupancyRate = totalOccupied / totalRooms;
		occupancyRate *= 100;
		
		System.out.print("Occupancy rate\t\t\t\t\t");
		System.out.printf("%.0f", occupancyRate);
		System.out.print("%");
		System.out.println();
	}
}
		