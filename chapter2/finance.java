/*  
Author: Catherine Smith
Assignment: 2-13
*/

import java.util.Scanner;

public class finance {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Amount for Savings: ");
		double savings = input.nextDouble();
		
		double base = (1 + 0.00417);
		double one = savings * base;
		double two = (savings + one) * base;
		double three = (savings + two) * base;
		double four = (savings + three) * base;
		double five = (savings + four) * base;
		double six = (savings + five) * base;
		
		System.out.println("After 6 months your savings will be: " + six + "$");
	}
}
