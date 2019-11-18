/* 
Author: Cat Smith
Assignment 6-17
Date: Nov 15
*/

import java.util.Scanner;

class Matrix {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
			
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);
			
	}
	
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