import java.util.*;
public class ForLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0; //to store the accumulated total of user input
		int input = 0; //to store the user input
		
		for (int count = 1; count <= 7; count++) {
			System.out.println("Please enter an integer.");
			input = scan.nextInt();
			scan.nextLine();
			sum += intput;
		}
		
		System.out.println("The total of the numbers you entered is " + sum + ".");		
	}
}