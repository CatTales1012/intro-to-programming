/* 
 Author: Catherine Smith
 Assignment: 2-1
 */


import java.util.Scanner;


public class Farenheit{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double Celsius = input.nextDouble();
		
		double farenheit = (9.0 / 5) * Celsius + 32;
		System.out.print(Celsius + " Celsius is " + farenheit + " Farenheit");
	}
}