/* 
Author: Cat Smith
Assignment: 6-3, palindrome/reverse methods
date: Nov 15, 2019
*/

import java.util.Scanner;

class ReversePalindrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter a Number: ");
		int number = input.nextInt();
		
		reverse(number);
		isPalindrome(number);
		
		System.out.println(reverse(number) + " is " + number + " reversed.");
		
		if(isPalindrome(number) == true){
			System.out.print(number + " is a palindrome.");
		}
		else{
			System.out.print(number + " is not a palindrome.");
		}
	}
	public static int reverse(int number){
		int reverse = 0;
		
		while(number != 0){
			reverse = reverse * 10;
			reverse = reverse + (number % 10);
			number = number / 10;
		}
		return reverse;
	}
	public static boolean isPalindrome(int number){
		reverse(number);
		
		if(number != reverse(number)){
			return false;
		}
		else{
			return true;
		}
	}
}