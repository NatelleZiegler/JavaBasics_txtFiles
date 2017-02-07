public class CelsiusToFahrenheitTable {
	public static void main(String[] args) {
		double fahrenheit = 0;
		double celsius = 0;
		
		System.out.println("Celsius\t\tFahrenheit");
		for (celsius = 0; celsius < 20; celsius++) {
			fahrenheit = (1.8 * celsius) + 32;
			System.out.printf("%.1f\t\t%.1f", celsius, fahrenheit);
			System.out.println();
			System.out.println("---------------------");
		}
	}
}