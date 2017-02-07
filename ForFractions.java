public class ForFractions {
	public static void main(String[] args) {
		double n = 1; //for numerator
		double d = 30; //for denominator
		double total = 0; //for running total
		
		for (n =1, d = 30; d >=1; n++, d--) {
			total += (n/d);
		}
		
		System.out.println("Your total is " + total + ".");
	}
}