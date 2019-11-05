/*
Author: Cat Smith
Assignment 3-19 implementation
*/

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Triangle Side One: ");
		double one = input.nextDouble();
		
		System.out.print("Please Enter Triangle Side Two: ");
		double two = input.nextDouble();
		
		System.out.print("Please Enter Triangle Side Three: ");
		double three = input.nextDouble();
		
		
		
		if (((one + two) > three) && ((two + three) > one) && ((one + three) > two)){
			System.out.println("The Perimeter of this Triangle is " + (one + two + three));
		}
		else {
			System.out.println("Input Given is Invalid.");
		}
		
		
	}
}
