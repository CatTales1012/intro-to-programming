/*
Author: Cat Smith
Assignment: 8-5, add two matrices
Date: Dec 13
*/

import java.util.Scanner;
class Addition {
	public static void main(String[] args) {
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] c = new double[3][3];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Matrix 1: ");
		for (int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				 a[row][col] = input.nextDouble();
			}
		}
		
		System.out.print("Enter Matrix 2: ");
		for (int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				 b[row][col] = input.nextDouble();
			}
		}
		
		for (int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("+");
		for (int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				System.out.print(b[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("=");
		
		addMatrix(a, b);
		
		for (int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				System.out.print(addMatrix(a,b)[row][col] + " ");
			}
			System.out.println();
		}
	}
	

	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[3][3];
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				c[row][col] = a[row][col] + b[row][col];
			}
		}
		
		
		return c;
	}
}