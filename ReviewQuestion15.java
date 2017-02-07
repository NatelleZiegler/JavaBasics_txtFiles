//Displays a random integer in the range of 1 through 10
import java.util.*;
public class ReviewQuestion15 {
	public static void main(String[] args) {
		Random rand = new Random();
		int number = 0;
		number = rand.nextInt(10) + 1;
		System.out.println(number);
	}
}