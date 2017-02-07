import java.util.*;
public class EuropeanCar {
	public static void main(String[] args) {
		final double CONSTANT = 0.6214;
		double kilo = 0;
		double mile = 0;
		System.out.println("KPH\t\tMPH");
		System.out.println("-----          -----");
		
		for (kilo = 60; kilo <= 130; kilo += 10) {
			mile = kilo * CONSTANT;
			System.out.printf("%.1f\t\t%.1f", kilo, mile);
			System.out.println();
		}
	}
}