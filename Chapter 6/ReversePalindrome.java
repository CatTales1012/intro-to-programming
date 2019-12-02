/* 
Author: Cat Smith
Assignment: 6-3, palindrome/reverse methods
date: Nov 15, 2019
*/
package d3;
import java.util.Scanner;

public class ReversePalindrome{
	/**
	 * <h1 style="color:green;">Reverse Palindrome JavaDocs</h1>
	 * <h2 style="color:blue;">Created Nov 15<br> Revisited Dec 2</h2>
	 * @author Cat Smith
	 * @version 1.5
	 * <p>This is a program to reverse a number and 
	 * also check if it is a Palindrome</p>
	 * @param args is the main method.
	 */
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
	/**
	 * 
	 * @param number is the number that is inputted by a user.
	 * @return the number inputted reversed.
	 */
	public static int reverse(int number){
		int reverse = 0;
		
		while(number != 0){
			reverse = reverse * 10;
			reverse = reverse + (number % 10);
			number = number / 10;
		}
		return reverse;
	}
	/** 
	 * 
	 * @param number is the number inputted by the user.
	 * @return whether the value is a palindrome or not.
	 */
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
