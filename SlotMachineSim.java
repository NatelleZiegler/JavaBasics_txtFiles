import java.util.*;
import java.io.*;
public class SlotMachineSim {
	public static void main(String [] args) throws IOException { 
		Scanner scan = new Scanner(System.in);
		
		double bet;
		double totalBet = 0; //the total amount entered into the slot machine
		double totalWon = 0; //total amount won from slot machine
		String input;
		char repeat;
		String images = "";
		
		do {
			System.out.println("How much would you like to bet?");
			System.out.print("$");
			bet = scan.nextDouble();
			scan.nextLine();
		
			while (bet <= 0) {
				System.out.println("Your bet must be a positive number greater than zero.");
				bet = scan.nextDouble();
				scan.nextLine();
			}
		
			Random rand = new Random();
			totalBet += bet;
		
			PrintWriter outputFile = new PrintWriter("Slots.txt");
			for (int count = 1; count <= 3; count++) {
				int number;
				number = rand.nextInt(5);
				outputFile.println(number);
				switch (number) {
				case 0: 
					images = "Cherries";
				break;
				case 1:
					images = "Oranges";
				break;
				case 2:
					images = "Plums";
				break;
				case 3:
					images = "Bells";
				break;
				case 4:
					images = "Melons";
				break;
				case 5:
					images = "Bars";
				break;
				default:
					System.out.println("Error.");
				break;
				}
				System.out.println(images);
			}
			outputFile.close();
		
			File myFile = new File("Slots.txt");
			Scanner inputFile = new Scanner(myFile);
		
			int num1, num2, num3;
			num1 = inputFile.nextInt();
			inputFile.nextLine();
		
			num2 = inputFile.nextInt();
			inputFile.nextLine();
		
			num3 = inputFile.nextInt();
			inputFile.nextLine();
			
			inputFile.close();
		
			if (num1 != num2 && num1 != num3 && num2 != num3) {
				System.out.println("None of your words match.  Sorry, you haven't won any money this round.");
			}
			else if (num1 == num2 && num1 == num3) {
				System.out.println("All of your words match!!!");
				System.out.println("You won three times the amount you entered!!!");
				bet *= 3;
				totalWon += bet;
				System.out.printf("You won $%,.2f", bet);
				System.out.println();
			}
			else {
				System.out.println("Two of your words match!!");
				System.out.println("You won two times the amount you entered!!");
				bet *= 2;
				totalWon += bet;
				System.out.printf("You won $%,.2f", bet);
				System.out.println();
			}
			System.out.println("Would you like to go another round?");
			System.out.println("Enter Y for yes and N for no.");
			input = scan.nextLine();
			input = input.toLowerCase();
			repeat = input.charAt(0);
			while (repeat != 'n' && repeat != 'y') {
				System.out.println("Please enter Y for yes or N for no.");
				input = scan.nextLine();
				input = input.toLowerCase();
				repeat = input.charAt(0);
			}
		} while (repeat == 'y');
		
		System.out.printf("You bet a total of $%,.2f.", totalBet);
		System.out.println();
		System.out.printf("You won a total of $%,.2f.", totalWon);
		System.out.println();
	}
}