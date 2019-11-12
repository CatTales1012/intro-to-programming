//Author: Cat Smith
//Assignment: 5-49

import java.util.Scanner;

class WordCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a word to check for vowels and consonants: ");
		String s = input.nextLine();

		int vowels = 0;
		int consonants = 0;

		s = s.toLowerCase();

		for (int i = 0; i < s.length(); ++i){
				char ch = s.charAt(i);
					
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
				}
				
			else{
				consonants++;
		}
	}
				
		System.out.println(s + " has " + vowels + " vowels.");
		System.out.print(s + " has " + consonants + " consonants. ");
	}
}