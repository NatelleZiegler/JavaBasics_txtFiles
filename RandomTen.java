import java.util.*;
public class RandomTen {
	public static void main(String[] args) {
		Random rand = new Random();
		int number = 0;
		String yesNo = " ";
		for (int count = 0; count < 10; count ++) {
			number = rand.nextInt(2);
			if (number == 0) {
				yesNo = "Yes";
			}
			else {
				yesNo = "No";
			}
			System.out.println((count + 1) + ". " + yesNo);
		}
	}
}
			