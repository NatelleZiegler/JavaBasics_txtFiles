public class NestedLoop {
	public static void main (String[] args) {
		final int COLS = 15; //number of pounds in a row
		final int ROWS = 10; //number of rows
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				System.out.print("#");
			}
		System.out.println();
		}
	}
}
		
		