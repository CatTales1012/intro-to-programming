/* 
Author: Catherine Smith
Assignment: 2-23
*/
import java.util.Scanner;

public class Driving {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Distance Driving: ");
		double driving = input.nextDouble();
		
		System.out.print("Enter Miles per Gallon: ");
		double miles = input.nextDouble();
		
		System.out.print("Enter Price per Gallon: ");
		double price = input.nextDouble();
		
		double cost = (driving / miles) * price ;
		
		System.out.print("The Cost of Driving is: " + cost);
	}
}