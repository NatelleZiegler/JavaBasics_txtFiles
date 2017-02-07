public class ReverseTriangle {
	public static void main (String[] args) {
		final int BASE_SIZE = 7;
		for (int r = 0; r < BASE_SIZE; r++) {
			for (int c = 0; c < (BASE_SIZE - r); c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}