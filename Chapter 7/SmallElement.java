/* 
Author: Cat Smith
Date: Dec 5
Assign: 7-9, find the smallest element in an array.
*/

import java.util.Scanner;

class SmallElement{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		double [] numbers = new double[10];
		for (int i = 0; i < 10; i++){
			numbers [i] = input.nextDouble();
		}
		min(numbers);
		
		System.out.print("The minimum number is: " + min(numbers));
	}
	
	public static double min(double [] numbers){
		double min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min){
				min = numbers[i];
			}
		}
		return min;
	}
}