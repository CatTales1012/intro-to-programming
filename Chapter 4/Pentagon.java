//Author: Cat Smith
//Assignment: 4-1

import java.util.Scanner;

public class Pentagon {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input the Length from the center of a pentagon to a Vertex:");
		double r = input.nextDouble();
		
		double s = (2 * r) * (Math.sin(Math.PI / 5));
		double area = (5 * (Math.pow(s, 2))) / (4 * (Math.tan(Math.PI / 5)));
		
		System.out.print("The Area of this Pentagon is: "  + area);

	}
}