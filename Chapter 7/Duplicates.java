/* 
Author: Cat Smith
Date: Dec 9
Assign: 7-15, Eliminate duplicates in an array.
*/

import java.util.Scanner;

class Duplicates{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		int [] numbers = new int[10];
		for (int i = 0; i < 10; i++){
			numbers [i] = input.nextInt();
		}
		
		numbers = eliminateDuplicates(numbers);
		
		System.out.println("The number of distinct numbers are: " + numbers.length);
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static int[] eliminateDuplicates(int[] numbers){
		int count = 0;
		int[] unique = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			boolean isUnique = true;
			
			for(int j = i + 1; j < numbers.length; j++){
				if(numbers[i] == numbers[j]){
					isUnique = false;
				}
			}	
			if (isUnique){
				unique[count] = numbers[i];
				
				count++;
			}
		}
		
		int[] finish = new int[count];
		for(int i = 0; i < count; i++){
			finish[i] = unique[i];
		}
		
		return finish;
	}
}
