/*
Author: Catherine Smith
Assignment 3-3 Implemention. 
*/

import java.util.Scanner;

public class Cramer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Variable A :");
		double a = input.nextDouble();
		
		System.out.println("Please Enter Variable B :");
		double b = input.nextDouble();
		
		System.out.println("Please Enter Variable C :");
		double c = input.nextDouble();
		
		System.out.println("Please Enter Variable D :");
		double d = input.nextDouble();
		
		System.out.println("Please Enter Variable E :");
		double e = input.nextDouble();
		
		System.out.println("Please Enter Variable F :");
		double f = input.nextDouble();
		
		if ( ((a * d) - (b * c)) == 0){
			System.out.println("The Equation does not have a Solution.");
		}
		else {
			System.out.println("X = " + (((e * d) - (b * f)) / ((a * d) - (b * c))));
			System.out.println("Y = " + (((a * f) - (e * c)) / ((a * d) - (b * c))));
		}
	}
}