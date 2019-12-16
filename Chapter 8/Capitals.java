/*
Author: Cat Smith
Assignment: 8-37, Guess the capitol for each state
Date: Dec 13
*/
import java.util.Scanner;
class Capitals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		String[][] states = {
		{"Utah", "Salt Lake City"},
		{"Arizona", "Phoenix"},
		{"Tennessee", "Nashville"},
		{"Colorado","Denver"},
		{"Illinois", "Springfield"},
		{"Iowa", "Des Moines"},
		{"Washington", "Olympia"},
		{"Montana", "Helena"},
		{"Louisana", "Baton Rouge"},
		{"Oregon", "Salem"}
		};
		
		int correct = 0;
		for (int i = 0; i < 10; i++){
			System.out.print("What is the Capital of " + states[i][0] + "? ");
			String checker = input.nextLine();
			
			if(checker.equalsIgnoreCase(states[i][1]) ){
				System.out.println("That is correct!");
				correct++;
			}
			else{
				System.out.println("The correct answer is: " + states[i][1]);
				
			}
		}
		System.out.print("You got " + correct + " out of 10 Correct!");
		
	}
}
