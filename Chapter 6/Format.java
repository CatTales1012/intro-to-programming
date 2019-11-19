
/* 
Author: Cat Smith
Assignment: 6-37, creating a format for prefix 0's in front of integer. 
Date: November 19
*/
		 
import java.util.Scanner;
		 
class Format {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("Please enter a number: ");
		String number = input.nextLine();
				
		System.out.print("Please enter a width: ");
		int width = input.nextInt();
				
		format(number, width);
				
		 
	}
	public static String format(String number, int width){
		width = width - number.length();
				
		for(int i = 0; i < width; i++){
			System.out.print("0");
		}
		
		System.out.print(number);
		return number; 
	}
}
	
