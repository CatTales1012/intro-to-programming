/* 
Author: Cat Smith
Assignment 6-17
Date: Nov 15
Revised: Nov 25
*/
package d17;
import java.util.Scanner;

public class Matrix {
	/**
	 * <h1>Matrix JavaDocs</h1>
	 * <h2>Created November 15, 2019 <br> Revisited November 25, 2019</h2>
	 * @author Cat Smith
	 * @param args part of the main method
	 * <p>This is a program that generates a matrix given a number
	 * (prints an N by N grid, with randomly generated numbers).</p>
	 * @version 1.0.5
	 */
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
			
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);
			
	}
	/**
	 * This is the method for generating the matrix given 'n'.
	 * @param n the number inputed to print out the grid.
	 */
	public static void printMatrix(int n){
		for(int i = 0; i < n; i++){
			// Start a row
				
			for(int j = 0; j < n; j++){
				// Each element
				System.out.print((int)(Math.random() * 2) + " ");
			}
			
			// End a row
			System.out.println();
		}
	}
}
