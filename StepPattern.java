public class StepPattern {
	public static void main (String [] args) {
		final int NUM_STEPS = 6;
		for (int r = 0; r < NUM_STEPS; r++) {
			System.out.print("#");
			for (int c = 0; c < r; c++) {
				System.out.print(" ");
			}
			System.out.println("#");
		}
	}
}