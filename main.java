import java.util.Scanner;
//This import is used to get user input
public class Main{
  //This is the main method of the program
  public static void main(String[] args){
//this takes string input from the user
    int correct = 0;//this counter will keep track of correct answers
    Scanner input = new Scanner(System.in);
    System.out.println("What is the Capital of Utah?");
    System.out.println("A) Salt Lake City");
    System.out.println("B) Provo");
    System.out.println("C) Ogden");
    System.out.println("D) St. George");
//This displays the question and the options
    String answer = input.nextLine();
    if (answer.equalsIgnoreCase("A")){//if this is true, the code below will run
      System.out.println("Correct.");
      correct ++;
    }
    else{ //if the input was anything other than A- this runs
      System.out.println("Incorrect.");
    }
    System.out.println("What is a Koala?");
    System.out.println("A) A mammal");
    System.out.println("B) A reptile");
    System.out.println( "C) A bird");
    System.out.println("D) A marsupial");
    answer = input.nextLine();
    if (answer.equalsIgnoreCase("D")){
      System.out.println("Correct.");
      correct ++;
    }
    else{
      System.out.println("Incorrect.");
    }

    System.out.println("What is the largest ocean?");
    System.out.println("A) Atlantic");
    System.out.println("B) Pacific");
    System.out.println("C) Indian");
    System.out.println("D) Arctic");

    answer = input.nextLine();
    if (answer.equalsIgnoreCase("B")){
      System.out.println("Correct.");
      correct++;
    }
    else{
      System.out.println("Incorrect.");
    }
    System.out.println("How many kids does Mr. and Mrs. Incredible have?");
    System.out.println("A) 2");
    System.out.println("B) 1");
    System.out.println("C) 3");
    System.out.println("D) 4");
    answer = input.nextLine();
    switch(answer){ //what happens if we use switch instead
      case "c": //if this is a capital C, this won't work
        System.out.println("Correct.");
        correct++;
        break;
        
      default://this will automatically run if the input isn't 'c'
        System.out.println("Incorrect.");
    }

    System.out.println("What is the color after red on the rainbow?");
    System.out.println("A) Orange");
    System.out.println("B) Yellow");
    System.out.println("C) Green");
    System.out.println("D) Blue");
//I prefer the if-else statements for these questions
    //They are easier to ignore caps or lowercase
    answer = input.nextLine();
    if(answer.equalsIgnoreCase("A")){
      System.out.println("Correct.");
      correct++;
    }
    else{
      System.out.println("Incorrect.");
    }

    System.out.println("You got " + correct + " out of 5 correct! That is a " + (correct/5.0)*100 + "%");//this is the final score and percent
  }
}