import java.util.*;
public class CustomReverseTriangle {
	public static void main (String[] args) {
	
		/* 
		This is a modification of the ReverseTriangle program.
		Here the user gets to set the base height of the triangle
		*/
		
		int baseSize = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.");
		baseSize = scan.nextInt();
		scan.nextLine();
		
		for (int r = 0; r < baseSize; r++) {
			for (int c = 0; c < (baseSize- r); c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int row = 0; row < baseSize; row++) {
			for (int col = 0; col < (row + 1); col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Now let's try to create a triangle with a random sized base
		
		Random rand = new Random();
		int crazyNum = 0;
		crazyNum = rand.nextInt(100) + 1;
		baseSize = crazyNum;
		
		System.out.println();
		System.out.println();
		
		for (int r = 0; r < baseSize; r++) {
			for (int c = 0; c < (baseSize- r); c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int row = 0; row < baseSize; row++) {
			for (int col = 0; col < (row + 1); col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}